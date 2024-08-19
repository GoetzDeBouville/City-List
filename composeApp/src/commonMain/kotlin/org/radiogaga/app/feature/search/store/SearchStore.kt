package org.radiogaga.app.feature.search.store

import com.arkivanov.mvikotlin.core.store.Reducer
import com.arkivanov.mvikotlin.core.store.SimpleBootstrapper
import com.arkivanov.mvikotlin.core.store.Store
import com.arkivanov.mvikotlin.core.store.StoreFactory
import com.arkivanov.mvikotlin.extensions.coroutines.CoroutineExecutor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import org.radiogaga.app.core.domain.model.City
import org.radiogaga.app.core.domain.model.ErrorType
import org.radiogaga.app.core.domain.model.Result
import org.radiogaga.app.core.ui.ErrorScreenState
import org.radiogaga.app.feature.search.domain.usecase.GetCitiesUseCase
import org.radiogaga.app.feature.search.store.SearchStore.Intent
import org.radiogaga.app.feature.search.store.SearchStore.Label

interface SearchStore : Store<Intent, SearchStore.State, Label> {

    sealed interface Intent {
        data class SearchTextChanged(val query: String) : Intent
        data object ClearSearch : Intent
    }

    sealed interface Action {
        class LoadCities(val query: String) : Action
        data object ClearCities : Action
    }

    data class State(
        val cityList: List<City> = emptyList(),
        val isLoading: Boolean = false,
        val errorType: ErrorScreenState? = null
    )

    sealed interface Msg {
        data class Loading(val isLoading: Boolean) : Msg
        data class CitiesLoaded(val cities: List<City>) : Msg
        data class LoadError(val error: ErrorType) : Msg
        data object Empty : Msg
    }

    sealed interface Label
}

internal class SearchStoreFactory(
    private val storeFactory: StoreFactory,
    private val getCitiesUseCase: GetCitiesUseCase
) {

    fun create(): SearchStore =
        object : SearchStore, Store<Intent, SearchStore.State, Label> by storeFactory.create(
            name = "SearchStore",
            initialState = SearchStore.State(),
            bootstrapper = SimpleBootstrapper(SearchStore.Action.ClearCities),
            reducer = ReducerImpl,
            executorFactory = { ExecutorImpl(getCitiesUseCase) }
        ) {}

    private object ReducerImpl : Reducer<SearchStore.State, SearchStore.Msg> {
        override fun SearchStore.State.reduce(msg: SearchStore.Msg): SearchStore.State {
            println("GFFFGAA ReducerImpl message: $msg")
            return when (msg) {
                is SearchStore.Msg.Empty -> {
                    val state = copy(
                        cityList = emptyList(),
                        errorType = ErrorScreenState.NOTHING_FOUND,
                        isLoading = false
                    )
                    println("GFFFGAA ReducerImpl state: $state")

                    state
                }

                is SearchStore.Msg.Loading -> {
                    val state = copy(isLoading = true)
                    println("GFFFGAA ReducerImpl state: $state")

                    state
                }
                is SearchStore.Msg.LoadError -> {
                    val state = copy(
                        cityList = emptyList(),
                        errorType = mapErrorToUiState(msg.error),
                        isLoading = false
                    )

                    println("GFFFGAA ReducerImpl state: $state")

                    state
                }

                is SearchStore.Msg.CitiesLoaded -> {
                    val state = copy(cityList = msg.cities, isLoading = false,  errorType = null)
                    println("GFFFGAA ReducerImpl state: $state")

                    state
                }
            }
        }

        private fun mapErrorToUiState(errorType: ErrorType): ErrorScreenState {
            return when (errorType) {
                ErrorType.NO_CONNECTION -> ErrorScreenState.NO_INTERNET
                ErrorType.NOTHING_FOUND -> ErrorScreenState.NOTHING_FOUND
                else -> ErrorScreenState.SERVER_ERROR
            }
        }
    }

    private class ExecutorImpl(private val getCitiesUseCase: GetCitiesUseCase) :
        CoroutineExecutor<Intent, SearchStore.Action, SearchStore.State, SearchStore.Msg, Label>() {

        override fun executeIntent(intent: Intent) {
            when (intent) {
                is Intent.SearchTextChanged -> getCityListByQuery(intent.query)

                is Intent.ClearSearch -> dispatch(
                    message = SearchStore.Msg.CitiesLoaded(
                        cities = emptyList()
                    )
                )
            }
        }

        override fun executeAction(action: SearchStore.Action) {
            when (action) {
                is SearchStore.Action.ClearCities -> dispatch(
                    message = SearchStore.Msg.CitiesLoaded(
                        cities = emptyList()
                    )
                )

                is SearchStore.Action.LoadCities -> getCityListByQuery(action.query)
            }
        }

        private var queryString = ""

        private fun getCityListByQuery(query: String) {
            val formatedQuery = formatString(query)
            if (queryString == formatedQuery) {
                println("Same string")
            } else {
                queryString = formatedQuery
                dispatch(SearchStore.Msg.Loading(true))
                runSafelyUseCase(
                    useCaseFlow = getCitiesUseCase.execute(formatedQuery),
                    scope,
                    onSuccess = { cities ->
                        scope.launch(Dispatchers.Main) {
                            dispatch(SearchStore.Msg.CitiesLoaded(cities))
                        }
                    },
                    onFailure = { error ->
                        scope.launch(Dispatchers.Main) {
                            dispatch(SearchStore.Msg.LoadError(error))
                        }
                    }
                )
            }
        }

        private inline fun <reified D> runSafelyUseCase(
            useCaseFlow: Flow<Result<D, ErrorType>>,
            coroutineScope: CoroutineScope,
            noinline onFailure: ((ErrorType) -> Unit)? = null,
            crossinline onSuccess: (D) -> Unit,
        ) {
            coroutineScope.launch(Dispatchers.IO) {
                runCatching {
                    useCaseFlow.collect { result ->
                        when (result) {
                            is Result.Success -> onSuccess(result.data)
                            is Result.Error -> {
                                onFailure?.invoke(result.error)
                            }
                        }
                    }
                }.onFailure { error ->
                    error.printStackTrace()
                    scope.launch(Dispatchers.Main) {
                        onFailure?.invoke(ErrorType.UNKNOWN_ERROR)
                    }
                }
            }
        }

        private fun formatString(str: String): String {
            val noPunctuation = str.trim().replace(Regex("[^\\w\\s-]"), "")
            return noPunctuation.replace(Regex("\\s+"), " ").trim()
        }
    }
}
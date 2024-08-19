package org.radiogaga.app.feature.search.presentation

import com.arkivanov.mvikotlin.core.store.Reducer
import com.arkivanov.mvikotlin.core.store.Store
import com.arkivanov.mvikotlin.core.store.StoreFactory
import com.arkivanov.mvikotlin.extensions.coroutines.CoroutineExecutor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import org.radiogaga.app.core.domain.model.City
import org.radiogaga.app.core.domain.model.ErrorType
import org.radiogaga.app.core.domain.model.Result
import org.radiogaga.app.core.ui.ErrorScreenState
import org.radiogaga.app.feature.search.domain.usecase.GetCitiesUseCase
import org.radiogaga.app.feature.search.presentation.SearchStore.Intent

internal class SearchStoreFactory(
    private val storeFactory: StoreFactory,
    private val getCitiesUseCase: GetCitiesUseCase
) {

    fun create(): SearchStore =
        object : SearchStore, Store<Intent, SearchStore.State, Nothing> by storeFactory.create(
            name = "SearchStore",
            initialState = SearchStore.State(),
            reducer = ReducerImpl,
            executorFactory = { ExecutorImpl(getCitiesUseCase) }
        ) {}

    private sealed interface Msg {
        data class Loading(val isLoading: Boolean) : Msg
        data class CitiesLoaded(val cities: List<City>) : Msg
        data class LoadError(val error: ErrorType) : Msg
        data object Empty : Msg
    }

    private object ReducerImpl : Reducer<SearchStore.State, Msg> {
        override fun SearchStore.State.reduce(msg: Msg): SearchStore.State {
            return when (msg) {
                is Msg.Empty -> copy(
                    cityList = emptyList(),
                    errorType = ErrorScreenState.NOTHING_FOUND,
                    isLoading = false
                )

                is Msg.Loading -> copy(isLoading = true)

                is Msg.LoadError -> copy(
                    cityList = emptyList(),
                    errorType = mapErrorToUiState(msg.error),
                    isLoading = false
                )

                is Msg.CitiesLoaded -> copy(
                    cityList = msg.cities,
                    isLoading = false,
                    errorType = null
                )
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
        CoroutineExecutor<Intent, Nothing, SearchStore.State, Msg, Nothing>() {

        override fun executeIntent(intent: Intent) {
            when (intent) {
                is Intent.SearchTextChanged -> getCityListByQuery(intent.query)

                is Intent.ClearSearch -> dispatch(
                    message = Msg.CitiesLoaded(
                        cities = emptyList()
                    )
                )
            }
        }

        private var queryString = ""

        private fun getCityListByQuery(query: String) {
            val formatedQuery = formatString(query)
            if (queryString == formatedQuery) {
                println("Same string")
            } else {
                queryString = formatedQuery
                dispatch(Msg.Loading(true))
                runSafelyUseCase(
                    useCaseFlow = getCitiesUseCase(formatedQuery),
                    onSuccess = { cities ->
                        scope.launch(Dispatchers.Main) {
                            if (cities.isEmpty()) {
                                dispatch(Msg.Empty)
                            } else {
                                dispatch(Msg.CitiesLoaded(cities))
                            }
                        }
                    },
                    onFailure = { error ->
                        scope.launch(Dispatchers.Main) {
                            dispatch(Msg.LoadError(error))
                        }
                    }
                )
            }
        }

        private inline fun <reified D> runSafelyUseCase(
            useCaseFlow: Flow<Result<D, ErrorType>>,
            noinline onFailure: ((ErrorType) -> Unit)? = null,
            crossinline onSuccess: (D) -> Unit,
        ) {
            scope.launch(Dispatchers.IO) {
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
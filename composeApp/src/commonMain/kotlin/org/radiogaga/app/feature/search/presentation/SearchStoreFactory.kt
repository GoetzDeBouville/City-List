package org.radiogaga.app.feature.search.presentation

import com.arkivanov.mvikotlin.core.store.Reducer
import com.arkivanov.mvikotlin.core.store.Store
import com.arkivanov.mvikotlin.core.store.StoreFactory
import com.arkivanov.mvikotlin.extensions.coroutines.CoroutineBootstrapper
import com.arkivanov.mvikotlin.extensions.coroutines.CoroutineExecutor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.radiogaga.app.core.domain.model.City
import org.radiogaga.app.core.domain.model.ErrorType
import org.radiogaga.app.core.ui.ErrorScreenState
import org.radiogaga.app.feature.search.domain.usecase.GetCitiesUseCase
import org.radiogaga.app.feature.search.presentation.SearchStore.Intent
import org.radiogaga.app.util.runSafelyUseCase

internal class SearchStoreFactory(
    private val storeFactory: StoreFactory,
    private val getCitiesUseCase: GetCitiesUseCase
) {

    fun create(): SearchStore =
        object : SearchStore, Store<Intent, SearchStore.State, Nothing> by storeFactory.create(
            name = "SearchStore",
            initialState = SearchStore.State(),
            bootstrapper = BootstrapperImpl(getCitiesUseCase),
            reducer = ReducerImpl,
            executorFactory = { ExecutorImpl(getCitiesUseCase) }
        ) {}

    private sealed interface Msg {
        data class Loading(val isLoading: Boolean) : Msg
        data class CitiesLoaded(val cities: List<City>) : Msg
        data class LoadError(val error: ErrorType) : Msg
        data object Empty : Msg
    }

    private sealed interface Action {
        data class Loading(val isLoading: Boolean) : Action
        data class CitiesLoaded(val cities: List<City>) : Action
        data class LoadError(val error: ErrorType) : Action
        data object Empty : Action
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
        CoroutineExecutor<Intent, Action, SearchStore.State, Msg, Nothing>() {

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

        override fun executeAction(action: Action) {
            when(action) {
                is Action.Loading -> dispatch(Msg.Loading(action.isLoading))
                is Action.CitiesLoaded -> dispatch(Msg.CitiesLoaded(action.cities))
                is Action.LoadError -> dispatch(Msg.LoadError(action.error))
                is Action.Empty -> dispatch(Msg.Empty)
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
                    scope = scope,
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

        private fun formatString(str: String): String {
            val noPunctuation = str.trim().replace(Regex("[^\\w\\s-]"), "")
            return noPunctuation.replace(Regex("\\s+"), " ").trim()
        }
    }

    private class BootstrapperImpl(private val getCitiesUseCase: GetCitiesUseCase) :
        CoroutineBootstrapper<Action>() {
        override fun invoke() {
            runSafelyUseCase(
                useCaseFlow = getCitiesUseCase("New"),
                scope = scope,
                onSuccess = { cities ->
                    scope.launch(Dispatchers.Main) {
                        if (cities.isEmpty()) {
                            dispatch(Action.Empty)
                        } else {
                            dispatch(Action.CitiesLoaded(cities))
                        }
                    }
                },
                onFailure = { error ->
                    scope.launch(Dispatchers.Main) {
                        dispatch(Action.LoadError(error))
                    }
                }
            )
        }
    }
}
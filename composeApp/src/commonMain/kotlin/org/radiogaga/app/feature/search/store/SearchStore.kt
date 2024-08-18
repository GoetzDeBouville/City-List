package org.radiogaga.app.feature.search.store

import com.arkivanov.mvikotlin.core.store.Store
import org.radiogaga.app.core.domain.model.City
import org.radiogaga.app.core.domain.model.ErrorType
import org.radiogaga.app.core.ui.ErrorScreenState
import org.radiogaga.app.feature.search.store.SearchStore.Intent
import org.radiogaga.app.feature.search.store.SearchStore.Label

internal interface SearchStore : Store<Intent, SearchStore.State, Label> {

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

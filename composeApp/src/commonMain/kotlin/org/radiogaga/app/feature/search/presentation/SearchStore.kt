package org.radiogaga.app.feature.search.presentation

import com.arkivanov.mvikotlin.core.store.Store
import org.radiogaga.app.core.domain.model.City
import org.radiogaga.app.core.ui.ErrorScreenState
import org.radiogaga.app.feature.search.presentation.SearchStore.Intent

interface SearchStore : Store<Intent, SearchStore.State, Nothing> {

    sealed interface Intent {
        data class SearchTextChanged(val query: String) : Intent
        data object ClearSearch : Intent
    }

    data class State(
        val cityList: List<City> = emptyList(),
        val isLoading: Boolean = false,
        val errorType: ErrorScreenState? = null
    )
}

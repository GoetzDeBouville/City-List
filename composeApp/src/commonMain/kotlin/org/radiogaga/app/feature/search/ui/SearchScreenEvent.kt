package org.radiogaga.app.feature.search.ui

sealed interface SearchScreenEvent{
    class SearchTextChanged(val query: String) : SearchScreenEvent
    data object ClearSearch : SearchScreenEvent
}

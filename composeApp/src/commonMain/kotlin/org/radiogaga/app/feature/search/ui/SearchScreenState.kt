package org.radiogaga.app.feature.search.ui

import org.radiogaga.app.core.domain.model.City
import org.radiogaga.app.core.ui.ErrorScreenState

data class SearchScreenState(
    val cityList: List<City>,
    val isLoading: Boolean = false,
    val errorType: ErrorScreenState? = null
)
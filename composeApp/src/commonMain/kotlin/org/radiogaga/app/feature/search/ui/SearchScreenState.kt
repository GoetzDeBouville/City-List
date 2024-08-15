package org.radiogaga.app.feature.search.ui

import org.radiogaga.app.core.domain.model.City
import org.radiogaga.app.core.ui.ErrorScreenState

sealed interface SearchScreenState {

    class Data(
        val cityList: List<City>
    ) : SearchScreenState

    data object Loading : SearchScreenState

    class Error(val errorType: ErrorScreenState) : SearchScreenState
}
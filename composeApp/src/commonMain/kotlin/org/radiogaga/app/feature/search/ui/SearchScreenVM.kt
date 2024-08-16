package org.radiogaga.app.feature.search.ui

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import org.radiogaga.app.base.BaseViewModel
import org.radiogaga.app.core.ui.ErrorScreenState
import org.radiogaga.app.feature.search.domain.usecase.GetCitiesUseCase

class SearchScreenVM(private val getCitiesUseCase: GetCitiesUseCase) : BaseViewModel() {
    private val _state = MutableStateFlow<SearchScreenState>(SearchScreenState.Data(emptyList()))
    val state = _state.asStateFlow()

    fun accept(event: SearchScreenEvent) {
        when (event) {
            is SearchScreenEvent.SearchTextChanged -> getCityListByQuery(event.query)
            is SearchScreenEvent.ClearSearch -> {
                _state.update {
                    SearchScreenState.Data(emptyList())
                }
            }
        }
    }

    private fun getCityListByQuery(query: String) {
        _state.update {
            SearchScreenState.Loading
        }
        runSafelyUseCase(
            useCaseFlow = getCitiesUseCase.execute(query),
            onSuccess = { cities ->
                if (cities.isEmpty()) {
                    _state.update { SearchScreenState.Error(ErrorScreenState.NOTHING_FOUND) }
                } else {
                    _state.update { SearchScreenState.Data(cities) }
                }
            },
            onFailure = { error ->
                _state.update { SearchScreenState.Error(mapErrorToUiState(error)) }
            }
        )
    }
}
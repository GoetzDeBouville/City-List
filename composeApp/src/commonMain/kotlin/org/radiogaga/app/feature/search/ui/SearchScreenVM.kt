package org.radiogaga.app.feature.search.ui

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import org.radiogaga.app.base.BaseViewModel
import org.radiogaga.app.core.ui.ErrorScreenState
import org.radiogaga.app.feature.search.domain.usecase.GetCitiesUseCase

class SearchScreenVM(private val getCitiesUseCase: GetCitiesUseCase) : BaseViewModel() {
    private val _state = MutableStateFlow(SearchScreenState(emptyList()))
    val state = _state.asStateFlow()

    private var queryString = ""

    fun accept(event: SearchScreenEvent) {
        when (event) {
            is SearchScreenEvent.SearchTextChanged -> getCityListByQuery(event.query)
            is SearchScreenEvent.ClearSearch -> {
                queryString = ""
                _state.update { SearchScreenState(cityList = emptyList()) }
            }
        }
    }

    private fun getCityListByQuery(query: String) {
        val formatedQuery = formatString(query)
        if (queryString == formatedQuery) {
            println("Same string")
        } else {
            queryString = formatedQuery
            _state.update {
                _state.value.copy(isLoading = true)
            }
            runSafelyUseCase(
                useCaseFlow = getCitiesUseCase.execute(formatedQuery),
                onSuccess = { cities ->
                    _state.update {
                        SearchScreenState(
                            cityList = cities,
                            isLoading = false,
                            errorType = if (cities.isEmpty()) ErrorScreenState.NOTHING_FOUND else null
                        )
                    }
                },
                onFailure = { error ->
                    _state.update {
                        SearchScreenState(
                            cityList = emptyList(),
                            isLoading = false,
                            errorType = mapErrorToUiState(error)
                        )
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
package org.radiogaga.app.feature.search.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import org.radiogaga.app.core.domain.model.City
import org.radiogaga.app.feature.search.domain.usecase.GetCitiesUseCase

class SearchScreenVM(private val getCitiesUseCase: GetCitiesUseCase) : ViewModel() {
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
            SearchScreenState.Data(cityList)
        }
    }
}


private val cityList = listOf(
    City(
        title = "Los-Angeles",
        subTitle = "Country: US population: 2kk",
        latitude = 4.5f,
        longitude = 6.7f
    ),
    City(
        title = "London",
        subTitle = "Country: UK population: 18kk",
        latitude = 4.5f,
        longitude = 6.7f
    ),
    City(
        title = "Tokio",
        subTitle = "Country: JP population: 22kk",
        latitude = 4.5f,
        longitude = 6.7f
    ),
)
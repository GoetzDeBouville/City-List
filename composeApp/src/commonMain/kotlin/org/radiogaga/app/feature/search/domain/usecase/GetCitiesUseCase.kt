package org.radiogaga.app.feature.search.domain.usecase

import kotlinx.coroutines.flow.Flow
import org.radiogaga.app.core.domain.model.City
import org.radiogaga.app.core.domain.model.ErrorType
import org.radiogaga.app.feature.search.domain.api.CitiesRepository
import org.radiogaga.app.core.domain.model.Result

class GetCitiesUseCase(private val repository: CitiesRepository) {

    fun execute(): Flow<Result<List<City>, ErrorType>> {
        return repository.getCityList()
    }
}
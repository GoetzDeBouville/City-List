package org.radiogaga.app.feature.search.domain.api

import kotlinx.coroutines.flow.Flow
import org.radiogaga.app.core.domain.model.City
import org.radiogaga.app.core.domain.model.ErrorType
import org.radiogaga.app.core.domain.model.Result

interface CitiesRepository {
    fun getCityList(): Flow<Result<List<City>, ErrorType>>
}
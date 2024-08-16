package org.radiogaga.app.feature.search.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.radiogaga.app.core.data.network.HttpNetworkClient
import org.radiogaga.app.core.data.network.model.mapToErrorType
import org.radiogaga.app.core.data.toDomain
import org.radiogaga.app.core.domain.model.City
import org.radiogaga.app.core.domain.model.ErrorType
import org.radiogaga.app.core.domain.model.Result
import org.radiogaga.app.feature.search.data.network.CityRequest
import org.radiogaga.app.feature.search.data.network.CityResponse
import org.radiogaga.app.feature.search.domain.api.CitiesRepository

class CitiesRepositoryImpl(
    private val httpNetworkClient: HttpNetworkClient<CityRequest, CityResponse>,
) : CitiesRepository {

    override fun getCityList(): Flow<Result<List<City>, ErrorType>> = flow {
        val response = httpNetworkClient.getResponse(CityRequest.CityeList)
        when (val body = response.body) {
            is CityResponse.CityList -> {
                emit(Result.Success(body.value.map { it.toDomain() }))
            }

            else -> {
                emit(Result.Error(response.resultCode.mapToErrorType()))
            }
        }
    }
}
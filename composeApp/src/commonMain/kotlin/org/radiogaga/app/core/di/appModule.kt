package org.radiogaga.app.core.di

import org.koin.dsl.module
import org.radiogaga.app.core.data.network.HttpNetworkClient
import org.radiogaga.app.feature.search.data.CitiesRepositoryImpl
import org.radiogaga.app.feature.search.data.network.CityHttpKtorClient
import org.radiogaga.app.feature.search.data.network.CityRequest
import org.radiogaga.app.feature.search.data.network.CityResponse
import org.radiogaga.app.feature.search.domain.api.CitiesRepository
import org.radiogaga.app.feature.search.domain.usecase.GetCitiesUseCase

val appModule = module {
    single {
        createHttpClient(engine = get())
    }

    single<HttpNetworkClient<CityRequest, CityResponse>> {
        CityHttpKtorClient(httpClient = get())
    }

    factory<CitiesRepository> { CitiesRepositoryImpl(httpNetworkClient = get()) }

    factory { GetCitiesUseCase(repository = get()) }

}

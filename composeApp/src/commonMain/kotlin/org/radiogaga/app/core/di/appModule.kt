package org.radiogaga.app.core.di

import com.arkivanov.mvikotlin.logging.store.LoggingStoreFactory
import com.arkivanov.mvikotlin.main.store.DefaultStoreFactory
import com.arkivanov.mvikotlin.timetravel.store.TimeTravelStoreFactory
import org.koin.dsl.module
import org.radiogaga.app.core.data.network.HttpNetworkClient
import org.radiogaga.app.feature.search.data.CitiesRepositoryImpl
import org.radiogaga.app.feature.search.data.network.CityHttpKtorClient
import org.radiogaga.app.feature.search.data.network.CityRequest
import org.radiogaga.app.feature.search.data.network.CityResponse
import org.radiogaga.app.feature.search.domain.api.CitiesRepository
import org.radiogaga.app.feature.search.domain.usecase.GetCitiesUseCase
import org.radiogaga.app.feature.search.store.SearchStoreFactory

val appModule = module {
    single {
        createHttpClient(engine = get())
    }

    single<HttpNetworkClient<CityRequest, CityResponse>> {
        CityHttpKtorClient(httpClient = get())
    }

    factory<CitiesRepository> { CitiesRepositoryImpl(httpNetworkClient = get()) }

    factory { GetCitiesUseCase(repository = get()) }

    factory { SearchStoreFactory(storeFactory = LoggingStoreFactory(TimeTravelStoreFactory()), getCitiesUseCase = get()).create() }
}

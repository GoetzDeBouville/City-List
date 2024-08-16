package org.radiogaga.app.core.di

import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import org.radiogaga.app.core.data.network.HttpNetworkClient
import org.radiogaga.app.feature.search.data.CitiesRepositoryImpl
import org.radiogaga.app.feature.search.data.network.CityHttpKtorClient
import org.radiogaga.app.feature.search.data.network.CityRequest
import org.radiogaga.app.feature.search.data.network.CityResponse
import org.radiogaga.app.feature.search.domain.usecase.GetCitiesUseCase
import org.radiogaga.app.feature.search.ui.SearchScreenVM

expect val platformModule: Module

val sharedModule = module {

    single<HttpNetworkClient<CityRequest, CityResponse>> {
        CityHttpKtorClient(httpClient = get())
    }

    singleOf(::CitiesRepositoryImpl)

    factoryOf(::GetCitiesUseCase)

    viewModelOf(::SearchScreenVM)
}
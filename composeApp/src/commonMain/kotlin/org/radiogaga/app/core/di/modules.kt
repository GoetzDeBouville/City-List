package org.radiogaga.app.core.di

import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.dsl.module
import org.radiogaga.app.feature.search.ui.SearchScreenVM

//expect val platformModule: Module

val sharedModule = module {
    viewModelOf(::SearchScreenVM)
}
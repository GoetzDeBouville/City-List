package org.radiogaga.app.core.di

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.radiogaga.app.feature.search.ui.SearchScreenVM

actual val viewModelModule = module {
    viewModelOf(::SearchScreenVM)
}

package org.radiogaga.app.core.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import org.radiogaga.app.feature.search.ui.SearchScreenVM

actual val viewModelModule = module {
    viewModel {
        SearchScreenVM(get())
    }
}

package org.radiogaga.app

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.koin.compose.KoinContext
import org.koin.compose.currentKoinScope
import org.radiogaga.app.feature.search.ui.SearchScreen
import org.radiogaga.app.feature.search.ui.SearchScreenVM
import org.radiogaga.app.navigation.Routes
import org.radiogaga.app.theme.AppTheme

@Composable
internal fun App() = AppTheme {
    KoinContext {
        NavHost(
            navController = rememberNavController(),
            startDestination = Routes.SearchScreen.route
        ) {
            composable(route = Routes.SearchScreen.route) {
                val viewModel = koinViewModel<SearchScreenVM>()
                SearchScreen(navController = rememberNavController(), viewModel)
            }
        }
    }
}

@Composable
inline fun <reified T: ViewModel> koinViewModel() : T {
    val scope = currentKoinScope()
    return viewModel {
        scope.get<T>()
    }
}

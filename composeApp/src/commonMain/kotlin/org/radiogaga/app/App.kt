package org.radiogaga.app

//import org.radiogaga.app.feature.search.ui.SearchScreenVM
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.koin.compose.KoinContext
import org.radiogaga.app.feature.search.presentation.SearchScreen
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
//                val viewModel = koinViewModel<SearchScreenVM>()
                SearchScreen(navController = rememberNavController())
            }
        }
    }
}

//@Composable
//inline fun <reified T: ViewModel> koinViewModel() : T {
//    val scope = currentKoinScope()
//    return viewModel {
//        scope.get<T>()
//    }
//}

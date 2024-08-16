package org.radiogaga.app.navigation

sealed class Routes(val route: String) {
    data object SearchScreen : Routes("search_screen")
}
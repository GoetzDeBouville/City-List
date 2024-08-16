package org.radiogaga.app.feature.search.data.network

sealed interface CityRequest {
    val path: String

    data object CityeList : CityRequest {
        override val path: String = "api/city/"
    }
}
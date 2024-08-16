package org.radiogaga.app.feature.search.data.network

sealed interface CityRequest {
    val path: String

    class CityeList(val query: String, val limit: Int = 20) : CityRequest {
        override val path: String = "city"
    }
}
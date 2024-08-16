package org.radiogaga.app.feature.search.data.network

import io.ktor.client.HttpClient
import org.radiogaga.app.core.data.network.NetworkConstants

class CityHttpKtorClient(private val httpClient: HttpClient) {
    suspend fun getCityList(query: String) : Result<String, NetworkConstants>
}
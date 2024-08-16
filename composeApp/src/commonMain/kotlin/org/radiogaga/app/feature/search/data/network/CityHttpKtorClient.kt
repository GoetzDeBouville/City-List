package org.radiogaga.app.feature.search.data.network

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.headers
import io.ktor.client.request.parameter
import io.ktor.client.statement.HttpResponse
import io.ktor.http.path
import org.radiogaga.app.core.data.network.HttpKtorNetworkClient
import org.radiogaga.app.core.data.network.NetworkConstants

class CityHttpKtorClient(private val httpClient: HttpClient) :
    HttpKtorNetworkClient<CityRequest, CityResponse>() {
    override suspend fun sendResponseByType(request: CityRequest): HttpResponse {
        return when (request) {
            is CityRequest.CityeList -> {
                httpClient.get {
                    url {
                        path(request.path)
                        parameter("format", "json")
                    }

                    headers {
                        NetworkConstants.TOKEN
                    }
                }
            }
        }
    }

    override suspend fun getResponseBodyByRequestType(
        requestType: CityRequest,
        httpResponse: HttpResponse
    ): CityResponse {
        return when(requestType) {
            is CityRequest.CityeList -> CityResponse.CityList(httpResponse.body())
        }
    }
}
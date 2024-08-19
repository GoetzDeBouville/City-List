package org.radiogaga.app.feature.search.data.network

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.headers
import io.ktor.client.request.parameter
import io.ktor.client.statement.HttpResponse
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.http.path
import org.radiogaga.app.core.data.network.HttpKtorNetworkClient
import org.radiogaga.app.core.data.network.NetworkConstants

class CityHttpKtorClient(private val httpClient: HttpClient) :
    HttpKtorNetworkClient<CityRequest, CityResponse>() {
    override suspend fun sendRequestByType(request: CityRequest): HttpResponse {
        return when (request) {
            is CityRequest.CityList -> {
                httpClient.get {
                    url {
                        path(request.path)
                        parameter("name", request.query)
                        parameter("limit", request.limit.toString())
                        contentType(ContentType.Application.Json)
                    }

                    headers {
                        append(AUTH_KEY, NetworkConstants.TOKEN)
                    }
                }
            }
        }
    }

    override suspend fun getResponseBodyByRequestType(
        requestType: CityRequest,
        httpResponse: HttpResponse
    ): CityResponse {
        return when (requestType) {
            is CityRequest.CityList -> CityResponse.CityList(httpResponse.body())
        }
    }

    companion object {
        const val AUTH_KEY = "X-Api-Key"
    }
}
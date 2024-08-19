package org.radiogaga.app.core.data.network

import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import io.ktor.http.isSuccess
import kotlinx.io.IOException
import kotlinx.serialization.SerializationException
import org.radiogaga.app.core.data.network.model.Response
import org.radiogaga.app.core.data.network.model.StatusCode

abstract class HttpKtorNetworkClient<SealedRequest, SealedResponse>(
) : HttpNetworkClient<SealedRequest, SealedResponse> {
    override suspend fun getResponse(sealedRequest: SealedRequest): Response<SealedResponse> {
        return runCatching {
            mapToResponse(
                requestType = sealedRequest,
                httpResponse = sendRequestByType(sealedRequest)
            )
        }.onFailure { error ->
            println("$TAG error -> $error")
            error.printStackTrace()
        }.getOrNull() ?: Response()
    }

    protected abstract suspend fun sendRequestByType(request: SealedRequest): HttpResponse

    protected abstract suspend fun getResponseBodyByRequestType(
        requestType: SealedRequest,
        httpResponse: HttpResponse
    ): SealedResponse

    private suspend fun mapToResponse(
        requestType: SealedRequest,
        httpResponse: HttpResponse
    ): Response<SealedResponse> {
        println("$TAG HTTP response status: ${httpResponse.status.value}")
        println("$TAG body = ${httpResponse.bodyAsText()}")
        return if (httpResponse.status.isSuccess()) {
            try {
                Response(
                    isSuccess = true,
                    resultCode = StatusCode(httpResponse.status.value),
                    body = getResponseBodyByRequestType(requestType, httpResponse)
                )
            } catch (e: SerializationException) {
                println("$TAG $e")
                Response(
                    isSuccess = false,
                    resultCode = StatusCode(httpResponse.status.value)
                )
            } catch (e: IOException) {
                println("$TAG $e")
                Response(
                    isSuccess = false,
                    resultCode = StatusCode(httpResponse.status.value)
                )
            }
        } else {
            Response(
                isSuccess = false,
                resultCode = StatusCode(httpResponse.status.value)
            )
        }
    }

    private companion object {
        val TAG = HttpKtorNetworkClient::class.simpleName ?: "HttpKtorNetworkClient"
    }
}
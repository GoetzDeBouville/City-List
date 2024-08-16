package org.radiogaga.app.core.data.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.HttpRequestRetry
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.observer.ResponseObserver
import io.ktor.client.request.accept
import io.ktor.client.request.header
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

fun createHttpClient(engine: HttpClientEngine): HttpClient {
    return HttpClient(engine) {
        install(Logging) {
            logger = object : Logger {
                override fun log(message: String) {
                    println("Logger Ktor => $message")
                }
            }
            level = LogLevel.ALL
        }

        install(HttpTimeout) {
            requestTimeoutMillis = NetworkConstants.CONNECTION_TIME_OUT_10_SEC
            connectTimeoutMillis = NetworkConstants.CONNECTION_TIME_OUT_10_SEC
        }

        install(HttpRequestRetry) {
            retryOnServerErrors(NetworkConstants.MAX_RETRIES_NUM_5)
            retryOnException(maxRetries = NetworkConstants.MAX_RETRIES_NUM_5)
            exponentialDelay(maxDelayMs = NetworkConstants.MAX_REQUEST_DELAY_10_SEC)
            modifyRequest { request ->
                request.headers.append("x-retry-count", "2")
            }
        }

        install(ContentNegotiation) {
            json(
                json = Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                }
            )
        }

        install(DefaultRequest) {
            header("X-Api-Key", NetworkConstants.TOKEN)
        }

        install(ResponseObserver) {
            onResponse { response ->
                println("HTTP status: ${response.status.value}")
            }
        }

        defaultRequest {
            url(NetworkConstants.BASE_URL)
            contentType(ContentType.Application.Json)
            accept(ContentType.Application.Json)
        }
    }
}

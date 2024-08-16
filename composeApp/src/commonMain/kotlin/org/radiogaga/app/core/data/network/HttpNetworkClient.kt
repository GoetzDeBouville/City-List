package org.radiogaga.app.core.data.network

import org.radiogaga.app.core.data.network.model.Response

interface HttpNetworkClient<T, R> {
    suspend fun getResponse(sealedRequest: T): Response<R>
}
package org.radiogaga.app.core.di

import io.ktor.client.engine.darwin.Darwin
import org.koin.dsl.module
import org.radiogaga.app.core.data.network.createHttpClient

actual val platformModule = module {
    single {
        createHttpClient(Darwin.create())
    }
}
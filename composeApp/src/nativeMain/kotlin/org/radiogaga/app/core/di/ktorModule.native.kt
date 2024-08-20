package org.radiogaga.app.core.di

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.darwin.Darwin
import org.koin.dsl.module

actual val ktorModule = module {
    single<HttpClientEngine> {
        Darwin.create()
    }
}
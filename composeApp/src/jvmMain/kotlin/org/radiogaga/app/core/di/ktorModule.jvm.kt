package org.radiogaga.app.core.di

import io.ktor.client.engine.okhttp.OkHttp
import org.koin.dsl.module

actual val ktorModule = module {
    single {
        OkHttp.create()
    }
}
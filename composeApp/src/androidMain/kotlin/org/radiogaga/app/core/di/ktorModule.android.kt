package org.radiogaga.app.core.di

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.android.Android
import org.koin.dsl.module

actual val ktorModule = module {
    single<HttpClientEngine> {
        Android.create()
    }
}
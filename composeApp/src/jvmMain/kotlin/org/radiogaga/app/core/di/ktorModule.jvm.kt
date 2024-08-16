package org.radiogaga.app.core.di

import io.ktor.client.engine.cio.CIO
import org.koin.dsl.module

actual val ktorModule = module {
    single {
        createHttpClient(CIO.create())
    }
}
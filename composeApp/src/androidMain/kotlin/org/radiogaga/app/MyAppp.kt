package org.radiogaga.app

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.radiogaga.app.core.di.initKoin

class MyAppp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MyAppp)
        }
    }
}
package org.radiogaga.app

import android.app.Application
import org.radiogaga.app.core.di.KoinInit

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        KoinInit(applicationContext).init()
    }
}
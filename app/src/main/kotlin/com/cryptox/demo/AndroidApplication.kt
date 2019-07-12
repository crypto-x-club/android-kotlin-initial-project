package com.cryptox.demo

import android.app.Application
import com.cryptox.demo.core.di.appModules
import com.squareup.leakcanary.BuildConfig
import com.squareup.leakcanary.LeakCanary
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class AndroidApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        this.initializeLeakDetection()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@AndroidApplication)
            modules(appModules)
        }
    }

    private fun initializeLeakDetection() {
        if (BuildConfig.DEBUG) LeakCanary.install(this)
    }
}

package com.adewan.playpal

import android.app.Application
import com.adewan.playpal.features.featureModule
import logcat.AndroidLogcatLogger
import logcat.LogPriority
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class PlayPalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Setup Debugging logging only
        AndroidLogcatLogger.installOnDebuggableApp(this, minPriority = LogPriority.VERBOSE)

        // Koin DI
        startKoin {
            modules(featureModule, applicationModule)
            androidContext(this@PlayPalApplication)
        }
    }
}

package com.pedroabreudev.superapp

import android.app.Application
import com.pedroabreudev.utilities.logging.AppLogger
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SuperApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        AppLogger.d(message = "Application is launched")
    }

    companion object{
        const val TAG = "SuperApplication"
    }
}
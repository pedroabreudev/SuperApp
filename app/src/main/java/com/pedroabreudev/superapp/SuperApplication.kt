package com.pedroabreudev.superapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SuperApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }

    companion object{
        const val TAG = "SuperApplication"
    }
}
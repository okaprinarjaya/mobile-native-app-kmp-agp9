package com.example.mynolduaapp

import android.app.Application
import com.example.mynolduaapp.di.initKoin
import org.koin.android.ext.koin.androidContext

class BookApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@BookApplication)
        }
    }
}
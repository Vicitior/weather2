package com.example.weather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class weatherApplication:Application() {
    companion object{
        const val TOKEN="BurgNyYPRyIzGgb0"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}
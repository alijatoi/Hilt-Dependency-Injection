package com.example.dependencyinjection

import android.util.Log
import dagger.Provides
import javax.inject.Inject

interface LoggerService{
    fun log (message : String)
}
class NiceLoggerService : LoggerService{
    override fun log(message: String) {
        Log.d("Nice Logger Service","$message")
    }

}

class ShareLoggerService : LoggerService{
    override fun log(message: String) {
        Log.d("Share Logger Service","$message")
    }

}
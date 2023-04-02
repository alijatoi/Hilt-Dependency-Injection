package com.example.dependencyinjection.di

import com.example.dependencyinjection.LoggerService
import com.example.dependencyinjection.NiceLoggerService
import com.example.dependencyinjection.ShareLoggerService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class) // InstallIn for "SCOPE" of the below object
object UserModule {
    @Provides
    @Named("ServiceOne")
    fun provideLoggerService() : LoggerService {
        return NiceLoggerService()
    }
    @Provides
    @Named("ServiceTwo")
    fun  anotherService() : LoggerService {
        return ShareLoggerService()
    }
}


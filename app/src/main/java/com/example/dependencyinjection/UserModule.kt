package com.example.dependencyinjection

import dagger.Module
import dagger.Provides

@Module
class UserModule {
    @Provides
    fun provideUserRepository() : UserRepository{
        return FirebaseRepository()
    }
}
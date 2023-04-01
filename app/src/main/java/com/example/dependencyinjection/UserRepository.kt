package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject
// interface and it's implementation

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("Logs", "save Repository")
    }
}

class FirebaseRepository : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("Loga", "save Firbase")
    }
}
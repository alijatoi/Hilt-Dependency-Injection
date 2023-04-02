package com.example.dependencyinjection

import javax.inject.Inject
import javax.inject.Named

// interface and it's implementation

class UserRepository @Inject constructor(@Named("ServiceOne") private val loggerService: LoggerService,
                                         @Named("ServiceTwo") private val anotherService: LoggerService) {
//    fun saveUser(email: String, password: String)
fun saveUser()
{
    loggerService.log("Service One")
    anotherService.log("Service Two")
}
}



//class SQLRepository @Inject constructor() : UserRepository {
//    override fun saveUser(email: String, password: String) {
//        Log.d("Logs", "save Repository")
//    }
//}
//
//class FirebaseRepository : UserRepository {
//    override fun saveUser(email: String, password: String) {
//        Log.d("Loga", "save Firbase")
//    }
//}
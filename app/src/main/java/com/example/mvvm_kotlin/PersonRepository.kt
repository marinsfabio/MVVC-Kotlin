package com.example.mvvm_kotlin

class PersonRepository {
    fun login(email: String, password: String): Boolean {
        return (email != "" && password != "")
    }
}
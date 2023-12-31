package com.example.mvvm_kotlin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private var textWelcome = MutableLiveData<String>()
    private var login = MutableLiveData<Boolean>()
    private val personRepository = PersonRepository()

    init {
        textWelcome.value = "Ola"
    }

    fun login(): LiveData<Boolean> {
        return login
    }

    fun welcome(): LiveData<String> {
                return textWelcome
            }

    fun doLogin(email: String, password: String) {
        login.value = personRepository.login(email, password)
    }
}


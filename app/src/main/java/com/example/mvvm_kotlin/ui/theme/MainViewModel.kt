package com.example.mvvm_kotlin.ui.theme

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private var textWelcome = MutableLiveData<String>()

    init {
        textWelcome.value = "Ola"
    }

    fun welcome(): LiveData<String> {
                return textWelcome
            }
}
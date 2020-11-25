package com.zwonb.hiltDemo.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel @ViewModelInject constructor(val repository: MainRepository) : ViewModel() {

    val nameLiveData = MutableLiveData<String>()

    fun getName() {
        nameLiveData.value = repository.name()
    }
}
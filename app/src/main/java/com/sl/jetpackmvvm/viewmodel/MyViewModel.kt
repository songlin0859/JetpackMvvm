package com.sl.jetpackmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    val name:MutableLiveData<String> by lazy {
        MutableLiveData()
    }

}
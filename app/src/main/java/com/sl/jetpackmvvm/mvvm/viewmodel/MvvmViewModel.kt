package com.sl.jetpackmvvm.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sl.jetpackmvvm.mvvm.bean.User

class MvvmViewModel : ViewModel() {
    val user: MutableLiveData<String> = MutableLiveData()

    fun getUserName(): MutableLiveData<String> {
        return user
    }

    fun setUserName(userName: String){
        user.value = userName
    }
}
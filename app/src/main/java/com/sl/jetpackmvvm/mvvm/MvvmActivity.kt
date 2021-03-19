package com.sl.jetpackmvvm.mvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.sl.jetpackmvvm.R
import com.sl.jetpackmvvm.databinding.ActivityMvvmBinding
import com.sl.jetpackmvvm.mvvm.bean.User
import com.sl.jetpackmvvm.mvvm.viewmodel.MvvmViewModel

class MvvmActivity : AppCompatActivity() {
    lateinit var viewModel: MvvmViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MvvmViewModel::class.java)
        val user = User("Csl", 30)
        //viewModel.user.value = user
        viewModel.user.value = "人生五十年 如梦亦如幻"
        val mBinding = DataBindingUtil.setContentView<ActivityMvvmBinding>(this, R.layout.activity_mvvm)
        mBinding.viewModel = viewModel
        mBinding.lifecycleOwner = this
    }
}
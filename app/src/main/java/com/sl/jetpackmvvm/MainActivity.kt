package com.sl.jetpackmvvm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sl.jetpackmvvm.lifecycle.TestLifecycleActivity
import com.sl.jetpackmvvm.livedata.LiveDataActivity
import com.sl.jetpackmvvm.mvvm.MvvmActivity
import com.sl.jetpackmvvm.viewmodel.ViewModelActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun activityLifecycle(view: View) {
        startActivity(Intent(this, TestLifecycleActivity::class.java))
    }

    fun liveData(view: View) {
        startActivity(Intent(this, LiveDataActivity::class.java))
    }

    fun viewModel(view: View) {
        startActivity(Intent(this, ViewModelActivity::class.java))
    }

    fun mvvm(view: View) {
        startActivity(Intent(this, MvvmActivity::class.java))
    }
}
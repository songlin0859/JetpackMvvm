package com.sl.jetpackmvvm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sl.jetpackmvvm.lifecycle.TestLifecycleActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun activityLifecycle(view: View) {
        startActivity(Intent(this, TestLifecycleActivity::class.java))
    }
}
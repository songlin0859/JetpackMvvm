package com.sl.jetpackmvvm.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sl.jetpackmvvm.R

class TestLifecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(MyLifecycleObserver())
        setContentView(R.layout.activity_test_lifecycle)
    }
}
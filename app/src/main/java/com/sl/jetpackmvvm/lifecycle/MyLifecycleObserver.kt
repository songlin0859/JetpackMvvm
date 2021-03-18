package com.sl.jetpackmvvm.lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class MyLifecycleObserver : LifecycleEventObserver {
    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        /**
         * 打印出日志
         *
         *  D/ActivityLifecycle: com.sl.jetpackmvvm.lifecycle.TestLifecycleActivity@3586ad7=>ON_CREATE
        D/ActivityLifecycle: com.sl.jetpackmvvm.lifecycle.TestLifecycleActivity@3586ad7=>ON_START
        D/ActivityLifecycle: com.sl.jetpackmvvm.lifecycle.TestLifecycleActivity@3586ad7=>ON_RESUME
        D/ActivityLifecycle: com.sl.jetpackmvvm.lifecycle.TestLifecycleActivity@3586ad7=>ON_PAUSE
        D/ActivityLifecycle: com.sl.jetpackmvvm.lifecycle.TestLifecycleActivity@3586ad7=>ON_STOP
        D/ActivityLifecycle: com.sl.jetpackmvvm.lifecycle.TestLifecycleActivity@3586ad7=>ON_DESTROY
         */
        Log.d("ActivityLifecycle", "$source=>$event")
    }
}
package com.sl.jetpackmvvm.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.sl.jetpackmvvm.R
import java.util.*

class ViewModelActivity : AppCompatActivity() {
    lateinit var myViewModel: MyViewModel
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)

        //myViewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)
        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        myViewModel.name.value = "ChenSonglin"

        myViewModel.name.observe(this) { name ->
            findViewById<TextView>(R.id.textView).text = name
        }

        handler = Handler().apply {
            postDelayed( {
                myViewModel.name.value = Date().toLocaleString()
            }, 2000)
        }
    }
}
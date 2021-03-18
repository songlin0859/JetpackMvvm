package com.sl.jetpackmvvm.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.sl.jetpackmvvm.R

class LiveDataActivity : AppCompatActivity() {

    lateinit var mStr:MutableLiveData<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)
        mStr = MutableLiveData()
        mStr.value = "hi SL"
        mStr.observe(this){
            findViewById<TextView>(R.id.textView).text = it
        }

        findViewById<EditText>(R.id.editText).addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
                mStr.value = p0?.toString() ?: "Null"
            }
        })
    }
}
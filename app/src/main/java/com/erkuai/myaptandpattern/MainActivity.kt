package com.erkuai.myaptandpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
//import com.erkuai.lib_reflection.BindView
//import com.erkuai.lib_reflection.Binding

class MainActivity : AppCompatActivity() {

//    @BindView(R.id.textView)
    var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Binding.bind(this)

        textView?.text = "123"

    }


}
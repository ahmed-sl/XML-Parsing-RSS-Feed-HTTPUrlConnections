package com.example.xmlparsingrssfeedhttpurlconnections

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var tv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = intent
        val data = intent.getStringArrayListExtra("ath")
        tv = findViewById(R.id.textView)
        tv.text ="$data"
    }
}
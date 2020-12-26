package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        //textView6.text="測驗結果:${editTextTextPersonName.text}為:"
        btn_homePage.setOnClickListener {
            startActivityForResult(Intent(this,MainActivity::class.java),1)
        }
    }
}

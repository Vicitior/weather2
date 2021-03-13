package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Start.setOnClickListener {
            var first=firstnumder.text.toString()
            var second=secondnumber.text.toString()
            val c=first.toInt()
            val d=second.toInt()
            if (c>=d){
                Toast.makeText(this,"数据错误",Toast.LENGTH_SHORT).show()
            }
            else{
            val num=(c..d).random().toString()
            number.text=num.toString()}
        }
        ppp.setOnClickListener {
            val num=(0..10000).random().toString()
            number.text=num.toString()
        }
    }
}
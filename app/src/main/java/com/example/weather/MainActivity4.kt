package com.example.weather

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        TOdo.setOnClickListener {
            val num=tel.text.toString()
            val number=num.toInt()
            val intent=Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:"+number)
            startActivity(intent)
        }
    }
}
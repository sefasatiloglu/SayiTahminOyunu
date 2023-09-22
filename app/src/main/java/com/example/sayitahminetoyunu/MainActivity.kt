package com.example.sayitahminetoyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView
    private lateinit var buttonBasla:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        imageView = findViewById(R.id.imageView)
        buttonBasla = findViewById(R.id.buttonBasla)

        buttonBasla.setOnClickListener {

            val yeniIntent = Intent(this@MainActivity,TahminActivity::class.java)
            startActivity(yeniIntent)




        }



    }
}
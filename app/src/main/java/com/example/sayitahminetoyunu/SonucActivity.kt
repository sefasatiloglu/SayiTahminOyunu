package com.example.sayitahminetoyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class SonucActivity : AppCompatActivity() {
    private lateinit var buttonTekrar:Button
    private lateinit var imageViewLose:ImageView
    private lateinit var textViewSonuc:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonuc)

        buttonTekrar = findViewById(R.id.buttonTekrar)
        imageViewLose = findViewById(R.id.imageViewLose)
        textViewSonuc = findViewById(R.id.textViewSonuc)

        val sonuc = intent.getBooleanExtra("sonuc",false)
        if (sonuc) {
            textViewSonuc.text = "KAZANDINIZ"
            imageViewLose.setImageResource(R.drawable.winkupa)

        }else {
            textViewSonuc.text = "KAYBETTINIZ"
            imageViewLose.setImageResource(R.drawable.dead)

        }
        buttonTekrar.setOnClickListener {

            val intent = Intent(this@SonucActivity,TahminActivity::class.java)
            finish()
            startActivity(intent)

        }

    }
}
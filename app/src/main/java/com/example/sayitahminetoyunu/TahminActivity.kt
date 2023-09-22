package com.example.sayitahminetoyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class TahminActivity : AppCompatActivity() {
    private var rastgeleSayi =0
    private var sayac = 5

    private lateinit var textViewKalan: TextView
    private lateinit var buttonTahmin:Button
    private lateinit var editTextTahminEt: EditText
    private lateinit var textViewArtir: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tahmin)
        textViewKalan = findViewById(R.id.textViewKalan)
        buttonTahmin = findViewById(R.id.buttonTahmin)
        editTextTahminEt = findViewById(R.id.editTextTahminEt)
        textViewArtir = findViewById(R.id.textViewArtir)
        rastgeleSayi = Random.nextInt(101)//0 ile 100
        Log.e("Rastgele Sayi:",rastgeleSayi.toString())


        buttonTahmin.setOnClickListener {

            sayac-=1
            val tahminAl = editTextTahminEt.text.toString().toInt()
            if (tahminAl == rastgeleSayi){
                val intent = Intent(this@TahminActivity,SonucActivity::class.java)
                intent.putExtra("sonuc",true)
                finish() //BackStack den silme
                startActivity(intent)
                return@setOnClickListener //Asagidaki kodlamalari calistirmiyor.

            }
            if (tahminAl>rastgeleSayi) {

                textViewArtir.text = "Azalt"
                textViewKalan.text = "Kalan Hak : $sayac"

            }
            if (tahminAl<rastgeleSayi) {
                textViewArtir.text = "Arttır"
                textViewKalan.text = "Kalan Hak : $sayac"

            }
            if (sayac == 0) {
                val intent = Intent(this@TahminActivity,SonucActivity::class.java)
                intent.putExtra("sonuc",false)
                finish() //BackStack den silme
                startActivity(intent)

            }
            editTextTahminEt.setText("")



        }


    }
}
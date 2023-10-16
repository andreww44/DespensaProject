package com.example.despensa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.despensa.adapters.ListaTienda

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TextTitle = findViewById<TextView>(R.id.cardTextViewTitle)
        TextTitle.setText("Despensa")

        //Boton para la siguente pantalla
        val button1 = findViewById<TextView>(R.id.button).setOnClickListener{

            val intent = Intent(this, ListaDespensa::class.java)
            startActivity(intent)
            // finish()
        }
        val button2 = findViewById<TextView>(R.id.button2).setOnClickListener{

            val intent = Intent(this, ListaTienda::class.java)
            startActivity(intent)
            // finish()
        }
    }
}
package com.acardona.labo04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity2 : AppCompatActivity() {

    private lateinit var name: TextView
    private lateinit var email: TextView
    private lateinit var phone: TextView
    private lateinit var share: Button

    private var nombre = ""
    private var correo = ""
    private var telefono = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        bind()
        addListeners()
    }

    private fun bind() {
        name = findViewById(R.id.nombreview)
        email = findViewById(R.id.correoview)
        phone = findViewById(R.id.telefonoview)
        share = findViewById(R.id.compartir)
    }

    private fun addListeners() {

        nombre = intent.getStringExtra("nombre").toString()
        correo = intent.getStringExtra("correo").toString()
        telefono = intent.getStringExtra("telefono").toString()

        name.text = nombre
        email.text = correo
        phone.text = telefono

        share.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT,  "nombre: "+nombre+"\n"+"correo: "+correo+"\n"+"telefono: "+telefono)
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }
    }
}

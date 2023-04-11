package com.acardona.labo04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var email: EditText
    private lateinit var phone: EditText
    private lateinit var save: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()
        addListeners()
    }

    private fun bind(){
        name = findViewById(R.id.nombretext)
        email =findViewById(R.id.correotext)
        phone =findViewById(R.id.telefonotext)
        save =findViewById(R.id.guardar)
    }

    private fun addListeners(){
        save.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("nombre",name.text.toString())
            intent.putExtra("correo",email.text.toString())
            intent.putExtra("telefono",phone.text.toString())
            startActivity(intent)}

         }
    }


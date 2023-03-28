package com.dgarzona.labo03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.math.BigDecimal
import kotlin.math.roundToInt

private lateinit var cincoCentavo: ImageView
private lateinit var diesCentavo: ImageView
private lateinit var cuartoCentavo: ImageView
private lateinit var dolarCentavo: ImageView
private lateinit var resultado: TextView
private var suma: Double = 0.00

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding()
        setListeners()
    }

    private fun binding() {

        cincoCentavo = findViewById(R.id.cincoCentavos)
        diesCentavo = findViewById(R.id.diesCentavos)
        cuartoCentavo = findViewById(R.id.veinticincoCentavos)
        dolarCentavo = findViewById(R.id.unDolar)
        resultado = findViewById(R.id.contador)
    }

    private fun setListeners() {

        cincoCentavo.setOnClickListener{
            suma+= 0.05
            var redondear = (suma*1000.0).roundToInt().toDouble()/1000.0
            resultado.text = redondear.toString()
        }

        diesCentavo.setOnClickListener{
            suma+=0.10
            var redondear = (suma*1000.0).roundToInt().toDouble()/1000.0
            resultado.text = redondear.toString()
        }


        cuartoCentavo.setOnClickListener{
            suma+=0.25
            var redondear = (suma*1000.0).roundToInt().toDouble()/1000.0
            resultado.text = redondear.toString()
        }

        dolarCentavo.setOnClickListener{
            suma+=1
            var redondear = (suma*1000.0).roundToInt().toDouble()/1000.0
            resultado.text = redondear.toString()
        }


    }


}












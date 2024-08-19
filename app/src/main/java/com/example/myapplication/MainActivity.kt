package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var xModelo = 0
    var yModelo = 0

    var resultado1 = 37
    var resultado2 = -4


    /*val resposta: TextView = findViewById(R.id.id1_resposta)*/
    fun mostrarResultado() {
        var sucesso = (xModelo*2+yModelo*3)
        var sucesso2 = (xModelo-yModelo)

        val resposta: TextView = findViewById(R.id.id1_resposta)

        if(sucesso == 37 && sucesso2 == -4){
            resposta.text = "Sucesso!"
        }
        else{
            resposta.text = "Incorreto!"
        }
        return
    }


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val botaoXUp: Button = findViewById(R.id.buttonXup)
        val botaoXDown: Button = findViewById(R.id.buttonXdown)

        val viewX: TextView = findViewById(R.id.id1_resultadoX)
        val viewX2: TextView = findViewById(R.id.id2_resultadoX)

        val botaoYUp: Button = findViewById(R.id.buttonYup)
        val botaoYDown: Button = findViewById(R.id.buttonYdown)

        val viewY: TextView = findViewById(R.id.id1_resultadoY)
        val viewY2: TextView = findViewById(R.id.id2_resultadoY)


        val botaoTeste: Button = findViewById(R.id.testar)

        botaoXUp.setOnClickListener {
            xModelo += 1
            viewX.text = "${xModelo}"
            viewX2.text = "${xModelo}"
        }

        botaoXDown.setOnClickListener {
            xModelo -= 1
            viewX.text = "${xModelo}"
            viewX2.text = "${xModelo}"

        }

        botaoYUp.setOnClickListener {
            yModelo += 1
            viewY.text = "${yModelo}"
            viewY2.text = "${yModelo}"
        }

        botaoYDown.setOnClickListener {
            yModelo -= 1
            viewY.text = "${yModelo}"
            viewY2.text = "${yModelo}"

        }

        botaoYDown.setOnClickListener {
            yModelo -= 1
            viewY.text = "${yModelo}"
            viewY2.text = "${yModelo}"

        }

        botaoYDown.setOnClickListener {
            yModelo -= 1
            viewY.text = "${yModelo}"
            viewY2.text = "${yModelo}"

        }

        botaoTeste.setOnClickListener{
            this.mostrarResultado()
        }








    }
}
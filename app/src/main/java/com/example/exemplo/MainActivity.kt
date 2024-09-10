package com.example.exemplo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var n = 0
        // Referência ao TextView
        val textView: TextView = findViewById(R.id.textView)

        // Referência ao Button
        val button: Button = findViewById(R.id.button)

        // Definindo o que acontece ao clicar no botão
        button.setOnClickListener {
            // Altera a frase do TextView
            if (n == 0) {
                textView.text =
                    "Parabéns você acaba de implementar um recurso em seu app nativo android!"
                n=n+1
            } else if (n == 1) {
                textView.text =
                    "Show essa aplicação esta funcionando perfeitamente!"
                n=n+1
            }else if (n == 2) {
                textView.text =
                    "App nativos tem a vantagem de utilizar o máximo de recurso do dispositivo!"
                n=n+1
            }else if (n == 3) {
                textView.text =
                    "Kotlin é uma linguagem de programação multiplataforma, orientada a objetos e funcional, concisa e estaticamente tipada."
                n=n+1
            }else if (n == 4) {
                textView.text =
                    "Para mais informações acesse o link https://kotlinlang.org/"
                n=0
            }
        }
    }
}
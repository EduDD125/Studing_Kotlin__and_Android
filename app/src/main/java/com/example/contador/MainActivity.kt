package com.example.contador

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var cliqueBt: Button
    private lateinit var contadorTv: TextView
    private lateinit var inicialEt: EditText
    private var contador: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // depois dessa função ocorre a criação dos objetos
                                               // que vamos querer referencias de dentro de resources

        cliqueBt = findViewById(R.id.cliqueBt)
        contadorTv = findViewById(R.id.contadorTv)
        inicialEt = findViewById(R.id.inicialEt)

        inicialEt.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // NSA
            }

            override fun onTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
                contador = s.toString().toInt()
            }

            override fun afterTextChanged(s: Editable?) {
                // NSA
            }
        })

        cliqueBt.setOnClickListener {
            contadorTv.text = ((++contador).toString());
        }
    }
}
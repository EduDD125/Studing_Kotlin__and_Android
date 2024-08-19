package com.example.contador

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.MenuItem
import android.view.View
import android.view.View.OnClickListener
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.contador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var amb: ActivityMainBinding
    private var contador: Int = 0;
    private var constante: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // depois dessa função ocorre a criação dos objetos
                                               // que vamos querer referencias de dentro de resources

        amb = ActivityMainBinding.inflate(layoutInflater) // primeira inflacao do xml
        setContentView(amb.root)  // secunda inflacao do xml. Aqui setamos oq será exibido


       amb.inicialSp.onItemSelectedListener = object: OnItemSelectedListener {
           override fun onItemSelected(
               parent: AdapterView<*>?,
               view: View?,
               position: Int,
               id: Long) {

               // vamos usar o metodo  "toString" ou "to<SomeType>" pq o conversor "as" é genÊrico
               // e não realiza as verificações que um método "to<SomeType>" realiza. Só usamos o
               // método conversor "as" quando não houver um "to<SomeType>" para a situação

               constante = when(position) {
                   0 -> 0
                   1 -> 1
                   2 -> 5
                   3 -> 10
                   else -> 0 // é necessário setar um default para esgotar as possibilidades
                             // isso é usado quando 'when' é usado como expressão
               }
           }

           override fun onNothingSelected(p0: AdapterView<*>?) {
               //NSA
           }
       }
        amb.cliqueBt.setOnClickListener {
            println(constante)
            contador = contador + constante;
            amb.contadorTv.text = ((contador).toString());
        }
    }
}
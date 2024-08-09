package com.example.myapplication

class Main {
    companion object {
        @JvmStatic
        fun main (args: Array<String>) {
            //templates de string para evitar concatenação
            val nome: String = "Eduardo"
            println("O nomme é: $nome")
            println("O nome também pode ser impresso assim: ${nome}")
            println("Ou assim para acessar propriedades da string: ${nome.length}")
            println("Ou chamar o método: ${nome.lowercase()}");





            /*#################################################
            *                  Null Safety
            * ################################################
            */

            // var nullString: String = null  -> retorna-rá erro. é necessário avisar
            // o Kotlin que permitimos o valor null na variável

            var nullString: String? = null;


        }
    }
}
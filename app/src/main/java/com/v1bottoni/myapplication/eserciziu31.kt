package com.v1bottoni.myapplication

class eserciziu31 {
    //Esercizio 1
    fun sum(x :String){
        when {
            x.isBlank() -> print("x è una stringa presente")
            x.isBlank() -> print("x è una stringa bianca")
            x.isNotBlank() -> print("x è una stringa vuota")
            x.isNotBlank() -> print("x è una stringa nulla")

        }
        }
        //Esercizio 2
        fun sum(){
            println("Come ti chiami?")
            var nome = readLine()
            println("Ciao $nome!")
        }
        //Esercizio 3

         fun sum(x: Double) {

             var seconds = (milliseconds / 1000) as Int % 60
             var minutes = (milliseconds / (1000 * 60) % 60) as Int
             var hours = (milliseconds / (1000 * 60 * 60) % 24) as Int
             print("trasformami il tempo")
         }

}
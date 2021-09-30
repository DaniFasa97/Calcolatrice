package com.v1bottoni.myapplication


    fun main(){
        val istanza = eserciziu32()
        print("Inserisci numero")
        val numero = readLine()?.toInt()
        istanza.sum(numero)

    }

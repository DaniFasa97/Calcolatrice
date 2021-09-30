package com.v1bottoni.myapplication

import java.util.*

class eserciziou33 {
        fun main(args: Array<String>) {
            val operazione: Int
            val scan = Scanner(System.`in`)
            println("Scegliere il tipo di operazione:")
            print("Inserire 1 per l'addizione, 2 per la sottrazione, 3 per la moltiplicazione, 4 per la divisione")
            operazione = scan.nextInt()
            when (operazione) {
                1 -> {
                    val numero: Double
                    val numero1: Double
                    val risulato: Double
                    print("Inserire primo numero: ")
                    numero = scan.nextInt().toDouble()
                    print("Inserire secondo numero: ")
                    numero1 = scan.nextInt().toDouble()
                    risulato = numero + numero1
                    print("Risultato: $risulato")
                }
                2 -> {
                    val numero: Double
                    val numero1: Double
                    val risulato: Double
                    print("Inserire primo numero: ")
                    numero = scan.nextInt().toDouble()
                    print("Inserire secondo numero: ")
                    numero1 = scan.nextInt().toDouble()
                    risulato = numero - numero1
                    print("Risultato: $risulato")
                }
                3 -> {
                    val numero: Double
                    val numero1: Double
                    val risultato: Double
                    print("Inserire primo numero: ")
                    numero = scan.nextDouble()
                    print("Inserire secondo numero: ")
                    numero1 = scan.nextDouble()
                    risultato = numero * numero1
                    print("Risultato: $risultato")
                }
                4 -> {
                    val numero: Double
                    val numero1: Double
                    val risultato: Double
                    print("Inserire primo numero: ")
                    numero = scan.nextDouble()
                    print("Inserire secondo numero: ")
                    numero1 = scan.nextDouble()
                    risultato = numero / numero1
                    print("Risultato: $risultato")
                }
            }
        }
    }



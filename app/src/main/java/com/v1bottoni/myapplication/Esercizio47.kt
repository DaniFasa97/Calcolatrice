package com.v1bottoni.myapplication


fun main(){
    val numbersMap = mapOf("key3" to 3,"key1" to 1,"key4" to 4,"key2" to 2)
    val numbersList = numbersMap.toList()
    val mappa = numbersList.sortedBy {it.second}.toMap()
    println(mappa)


    }






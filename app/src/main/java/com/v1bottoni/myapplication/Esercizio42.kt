package com.v1bottoni.myapplication

fun main() {
    val numbers = mutableListOf("one", "two", "three")
    val array = numbers.toTypedArray()
        //for(s in array) println(s)
    array.forEach {println(it) }
}


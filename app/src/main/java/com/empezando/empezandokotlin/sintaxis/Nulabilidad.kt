package com.empezando.empezandokotlin.sintaxis

fun main(){
    /**
     * Las variables pueden ser nulas
     */

    var name:String? = null

    // Si no es null devuelve la posición 2 del string
    println(name?.get(2) ?: "Es null")
}
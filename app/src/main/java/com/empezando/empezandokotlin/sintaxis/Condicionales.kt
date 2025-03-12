package com.empezando.empezandokotlin.sintaxis

fun main(){

    ifSimple()

    // Con un ! delante de una condición, devuelve la contraria
    val falso = false
    val verdadero = !falso
    println(verdadero) // Nos da true
    condicionesMultiples()
}

fun ifSimple() {
    val name = "Juanqui"

    if(name == "Juanqui") {
        // Si se cumple el if se ejecuta este bloque
        println("Nombre correcto")
    } else if (name == "Ana") {
        // Si no se cumple la condición se ejecuta este bloque
        println("Nombre incorrecto")
    } else {
        // Este bloque se ejecuta cuando ninguno de los anteriores se cumple
        println("Nombre incorrecto")
    }
}

fun condicionesMultiples() {
    var age = 16
    var parentPermission = true

    // Se tiene que cumplir alguna de las condiciones

    if(age >= 18 || parentPermission == true) {
        println("Puedes pasar")
    } else {
        println("No puedes pasar")
    }
}

fun variasCondiciones() {
    var age = 16
    var parentPermission = false

    // Se tienen que cumplir ambas condiciones
    if(age >= 16 && parentPermission == true) {
        println("Puedes pasar")
    } else {
        println("No puedes pasar")
    }
}
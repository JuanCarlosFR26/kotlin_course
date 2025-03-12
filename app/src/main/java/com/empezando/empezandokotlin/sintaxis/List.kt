package com.empezando.empezandokotlin.sintaxis

/**
 * Muy parecidos a los arrays
 */

fun main(){
    // inmutableList()
    mutableList()
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    println(readOnly.size) // 7
    println(readOnly) // Muestra todos los datos del array entre []
    println(readOnly[0]) // Lunes
    println(readOnly.last()) // Último valor
    println(readOnly.first()) // Primer valor

    // it es cada posición como en un bucle
    val example = readOnly.filter { it.contains("a") }
    println(example) // [Martes, Sábado]

    readOnly.forEach { weekDay -> println(weekDay)} // Bucle forEach para recorrer y mostrar todos los valores de la lista readOnly
}

fun mutableList(){
    val weekDays:MutableList<String> = mutableListOf("Lunes", "Martes")
    println(weekDays) // [Lunes, Martes]

    weekDays.add("Miércoles") // Añade Miércoles al final de la lista mutable
    weekDays.add(0, "Domingo") // Añade Domingo en la posición 0

    if(weekDays.isEmpty()) {
        println("No pinto nada")
    } else {
        weekDays.forEach { println(it)}
    }

    if(weekDays.isNotEmpty()) {
        weekDays.forEach {println(it)}
    }

    for(item in weekDays) {
        println(item)
    }


    weekDays.last() // Último valor
}
package com.empezando.empezandokotlin.sintaxis

fun main(){
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    /**
     *

    println(weekDays) // Nos muestra su lugar en memoria pero no sus datos

    // Índice 0-7
    // Tamaño 7

    println(weekDays.size) // 7
    println(weekDays[2]) // Miércoles
    weekDays[8] = "Days" // No se puede hacer. El array es valor fijo

    // Modificar valor
    weekDays[0] = "Saludo"
    println(weekDays[0]) // Ahora sería "Saludo". Se puede modificar valores de un array ya definido

     */
    // Bucles para array
    for(position in weekDays){
        println(position)
        /**
         * Nos muestra todos los datos del array
         */
    }

    for(position in weekDays.indices){
        println(position)
        /**
         * Nos muestra los indices
         */
    }
}
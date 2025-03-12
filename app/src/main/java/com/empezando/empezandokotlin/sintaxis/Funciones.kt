package com.empezando.empezandokotlin.sintaxis


/**
 * Las funciones son bloques de código que se pueden reutilizar
 */

fun main() {
    /**
     * Con la función main empezamos el código
     */

    // Llamamos a la función numérica
    variablesNumericas()

    /**
     * Si intentas usar una variable de dentro de la función variablesNumericas te dará error, porque solo existe dentro de dicha función
     */
}

/**
 * Podemos crear una función fuera de la función main()
 */

fun variablesNumericas(){
    /**
     * Las variables dentro de la función solo tienen alcance dentro de la función (scope)
     */

    /**
     * VARIABLES NUMÉRICAS
     */

    // Int
    val edad:Int = 30

    // Long
    val cantidad:Long = 12312319231231

    // Float
    val floatNum:Float = 3.21f // Android ignora la f

    // Double
    val doubleNum:Double = 3.2342424 // Igual que float pero acepta más decimales

    /**
     * OPERACIONES CON VARIABLES
     */

    // Suma
    val num1 = 30
    val num2 = 50
    val resultado = num1 + num2
    println(resultado)

    // Resta
    println(num1 - num2)

    // Multiplicación
    println(num1 * num2)

    // División
    println(num1 / num2)

    // Módulo
    println(num1 % num2)
}
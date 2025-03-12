package com.empezando.empezandokotlin

fun main(){
    /**
     * Llamamos a la función y le damos argumento para ver el parámetro
     */

    showMyName("Juan Carlos")
    showMyName("Alicia")
    showMyName("Federico")

    /**
     * Llamamos a la función que devuelve una suma float
     */

    val resultadoSuma = sumar(2.5f, 7.5f) // Resultado 10.0
    println(resultadoSuma)

    val edad1 = mostrarEdad(38)
    val edad2 = mostrarEdad()
    println(edad1) // Mostrará 38
    println(edad2) // Mostrará 30 por defecto

}

/**
 * Creamos una función con un parámetro 'name' de entrada
 */
fun showMyName(name:String){
    println("Hola, me llamo $name")
}

/**
 * Podemos crear funciones que retornen un valor con 'return'
 */
fun sumar(num1:Float, num2:Float):Float {
    /**
     * Tiene dos parámetros de tipo Float, y devuelve una suma de tipo Float
     */
    return num1 + num2
}

/**
 * Se puede especificar un valor por defecto. Recibe una edad Int y devuelve un tipo Int
 */
fun mostrarEdad(age:Int = 30):Int {
    return age
}
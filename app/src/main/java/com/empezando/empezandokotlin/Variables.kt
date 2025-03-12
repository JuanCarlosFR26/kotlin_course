package com.empezando.empezandokotlin

fun main(){

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
     * VARIABLES ALFANUMÉRICAS
     */

    // Char -> Caracteres
    val caracter:Char = 'a'

    // String
    val name:String = "Soporta cualquier tipo de texto"

    /**
     * VARIABLES BOOLEANAS
     */

    // Boolean
    val verdadero:Boolean = true
    val falso:Boolean = false

    /**
     * EJEMPLOS DE USO
     */
    print(name) // Al ejecutar se ve lo guardado en la variable 'name'
    print(verdadero)
    print(caracter)

    /**
     * Todos los que son 'val' no se pueden modificar su valor. Son CONTSTANTES
     * Para que sean modificables se tiene que usar 'var' (variable), los 'val' son (valores)
     */

    var nuevaEdad:Int = 30

    print(nuevaEdad) // Aquí muestra 30

    nuevaEdad = 32

    print(nuevaEdad) // Mostrará 32 porque la hemos iniciado con 30 y se le ha reasignado 32

    println("Con println pintamos por pantalla y añadimos salto de línea") // Añade salto de línea el 'println'

    /**
     * ========================================================== TRABAJANDO CON VARIABLES ==========================================================
     */

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

    // Si sumas strings haces concatenación
    val str1 = "4"
    val str2 = "35"
    println(str1 + str2)

    // Formateo de cadenas
    val cadenaFormateada = "Tengo $str1 años"
    println(cadenaFormateada)

    // Podemos pasar a strings o numéricos con toString() o toFloat() etc
    val num3 = 3.5
    println(num3)
    val num3ToInt = num3.toInt()
    println(num3ToInt)
}

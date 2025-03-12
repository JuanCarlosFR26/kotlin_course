package com.empezando.empezandokotlin

fun main(){
    /**
     * When es como un switch pero mucho más potente
     */
    getMonth(6)
    getSemestre(9)
    getTrimestre(2)
    getDia(19)
    val resultado:String = devolverDatos(13)
    println(resultado)

}

fun getMonth(month:Int){
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("No es un mes válido")
        /**
         * Para escribir más bloque se pone -> {bloque}
         */
    }
}

fun getTrimestre(trimestre:Int){
    when(trimestre){
        1, 2, 3 -> println("Primer trimestre")
        4, 5, 6 -> println("Segundo trimestre")
        7, 8, 9 -> println("Tercer trimestre")
        10, 11, 12 -> println("Cuarto trimestre")
        else -> println("Trimestre no valido")
    }
}

fun getSemestre(semestre:Int){
    when(semestre){
        1, 2, 3, 4, 5, 6 -> println("Primer semestre")
        7, 8, 9, 10, 11, 12 -> println("Segundo semestre")
        else -> println("Semestre no valido")
    }
}

fun getDia(dia:Int){
    when(dia){
        in 1..14 -> println("Primera quincena")
        in 15..31 -> println("SEgunda quincena")
        else -> println("Quincena no válida")
    }
}

fun devolverDatos(premio: Int) = when(premio){
        in 1..5 ->  "Te toca pagar 1€"
        in 6..12 ->  "Te toca pagar 2€"
        13 ->  "Premio"
        in 14..20 ->  "Te toca pagar 10€"
        else -> "Valor no válido"
    }

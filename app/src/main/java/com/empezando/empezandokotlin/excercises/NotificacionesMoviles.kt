package com.empezando.empezandokotlin.excercises

fun main(){
    /**
     * URL del ejercicio
     * https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?hl=es-419#1
     */

    println(printNotificationsSummary(51))
    println(printNotificationsSummary(102))

}

fun printNotificationsSummary(notifications: Int) = when {
    notifications < 1 -> "Not a valid number"
    notifications in 1..99 -> "You have $notifications notifications."
    else -> "Your phone is blowing up! You have 99+ notifications."
}
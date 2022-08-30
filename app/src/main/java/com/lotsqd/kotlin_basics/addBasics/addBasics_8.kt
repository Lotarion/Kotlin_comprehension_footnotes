package com.lotsqd.kotlin_basics.addBasics

fun main () {
    val str = getNumber("10.5")
    println(str)
}

fun getNumber(string: String): Int {
    return try {
        Integer.parseInt(string)
    } catch (e: NumberFormatException) {
        0
    } catch (e: ArithmeticException) {
        0
    }
}
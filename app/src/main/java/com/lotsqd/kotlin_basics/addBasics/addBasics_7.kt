package com.lotsqd.kotlin_basics.addBasics

fun main() {
    val location: Any = "Kotlin"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString)
    println(safeInt)
}
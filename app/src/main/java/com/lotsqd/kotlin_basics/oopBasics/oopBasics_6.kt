package com.lotsqd.kotlin_basics.oopBasics

import kotlin.math.floor

fun main() {
    val stringList: List<String> = listOf("Bogdan", "Phillip", "Michael", "gary")
    val mixedTypeList: List<Any> = listOf("Bogdan", 30, 4, "BDay", 70.4, "weighs", "Kg")

    for (value in mixedTypeList) {
        when (value) {
            is Int -> println("Integer: '$value'")
            is Double -> println("Double: '$value' with floor value '${floor(value)}'")
            is String -> println("String: '$value' of length ${value.length}")
            else -> println("Unknown type")
        }
    }

    // Smart cast

    val obj1: Any = "I have a dream"
    if (obj1 !is String) {
        println("Not a String")
    } else {
        // in this scope object of type Any is cast to a String
        println("Found a String of length ${obj1.length}")
    }

    // unsafe casting with as
    val str1: String = obj1 as String
    println(str1.length)

//    val obj2: Any = 1337
//    val str2: String = obj2 as String
//    println(str2)

    // safe casting with as? (nullable)
    val obj3: Any = 228
    val str3: String? = obj3 as? String
    println(str3)
}
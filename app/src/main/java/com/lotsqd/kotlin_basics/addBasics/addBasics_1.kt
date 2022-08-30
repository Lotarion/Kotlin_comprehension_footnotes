package com.lotsqd.kotlin_basics.addBasics

fun main () {
    val numbers: Array<Any> = arrayOf(5, 10, 25, 50, 256)
    val weekdays: Array<Any> = arrayOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
    println(weekdays.contentToString())
    printArray(weekdays, ", ", true)

    println("---------------------------------------")

    println(numbers[2])
    println(numbers[4])
    numbers[2] = 34
    numbers[4] = 56
    println(numbers[2])
    println(numbers[4])

    println("---------------------------------------")

    // EXAMPLE PHONE NUMBERS
    val contacts = arrayOf(
        Contact("Mom", 380507126205),
        Contact("Julie", 380995562285),
        Contact("Anthony", 380990832265)
    )
    for (index in contacts.indices) println("${contacts[index].name} is in index $index")
}

/*
local mf solves problems with his own functions,
doesn't try to look into the documentation

bruh
*/

fun printArray (array: Array<Any>, spacer: String, endOfLine: Boolean) {
    print("[ ")
    for (i in array) {
        print("$i$spacer")
    }
    for (a in 1..spacer.length) {
        print("\b")
    }
    print(" ]")
    if (endOfLine) print("\n")
}

data class Contact(val name: String, val phoneNumber: Long)
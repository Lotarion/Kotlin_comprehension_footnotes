package com.lotsqd.kotlin_basics.KotlinBasics

import kotlin.system.exitProcess

fun main() {
    var heightp1 = 172
    var heightp2 = 181

    if(heightp1 > heightp2){
        println("use raw force")
    } else if (heightp1 == heightp2) {
        println("can go forcing, but additional technique use is advised")
    }else {
        println("approach and use technique")
    }

    val age = -5

    if (age >= 21) {
        print("you can finally drink in the US")
    } else if (age >= 18) {
        print("you can vote")
    } else if (age >= 16) {
        print("you can drive")
    } else {
        print("you are a kid. Enjoy life while you can")
    }

    val name = "Denis"
    if (name == "Daniel") {
        println("Welcome, Daniel")
    } else println("RESTRICTED AREA. PROCEED TO LEAVE UNDER A THREAT OF DEATH")

    val season = 5
    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> exitProcess(status = 1)
    }

    val month = 5
    when (month) {
        in 1..2, 12 -> println("Winter")
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> {
            println("Fall")
            println("Autumn")
        }
        else -> exitProcess(status = 1)
    }

    when (age) {
        in 21..9999 -> print("you can finally drink in the US")
        in 18..20 -> print("you can vote")
        in 16..17 -> print("you can drive")
        in 0..15 -> print("you are a kid. Enjoy life while you can")
        else -> exitProcess(status = 1)
    }

    var x : Any = 13.37
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    //while loop executes a block of code as long as the given condition is true
    var w = 1
    while (w <= 10) {
        print("$w ")
        w++
    }
    println("\nwhile loop is done")

    //exercise loop
    var w2 = 100
    while (w2 >= 0) {
        print("$w2 ")
        w2 -= 2
    }
    println("\nwhile loop is done")
    do {
        print("$w ")
        w++
    } while (w <= 10)

    var feltTemp = "cold"
    var roomTemp = 15
    while (feltTemp == "cold") {
        roomTemp++
        print("$roomTemp ")
        if (roomTemp >= 19) {
            feltTemp = "normal"
            print ("it's ok now")
        }
    }

    for (num in 1..10) {
        print("$num ")
    }
    print("\n---------------\n")
    for (i in 1 until 10) {
        print("$i ")
    }
    print("\n---------------\n")
    for (i in 10 downTo 1 step 2) { // same as for(i in 10.downTo(1).step(2))
        print("$i ")
    }
}
package com.lotsqd.kotlin_basics.KotlinBasics

fun main() {
    for (i in 1..10000) {
        if (i == 9001) {
            print("IT'S OVER 9000!!!")
        }
    }

    var humidity = "humid"
    var humidityLevel = 80
    while (humidity != "comfy") {
        humidity = "humid"
        humidityLevel -= 5
        println("humidity decreased")
        if (humidityLevel < 60) {
            println("it's comfy now")
            humidity = "comfy"
        }
    }
}
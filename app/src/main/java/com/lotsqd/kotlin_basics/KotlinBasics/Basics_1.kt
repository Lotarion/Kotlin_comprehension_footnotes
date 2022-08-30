package com.lotsqd.kotlin_basics.KotlinBasics

fun main() {
    // Your normal String, nothing fancy
    var name = "Dani"
    var age = 15

    // In Kotlin, integers have different types, that vary in their memory usage:
    val theByte: Byte = 8 // 8 bits
    val theShort: Short = 450 // 16 bits
    val theInt = 45_000_000 // 32 bits, default int type
    val theLong = 33_000_000_000_000 // 64 bits

    // Floats are classic, with a 32 bit Float, and a 64 bit Double
    val theFloat = 2.456F
    val theDouble = 3.14159265358979323946

    // A regular Boolean, nothing too crazy
    var isSunny = true

    // Char, as the name might suggest, stores single characters
    var letterChar = 'A'
    var digitChar = '1'

    // Back to strings, they are actually char lists, as seen there:
    var firstChar = name[0]
    var lastChar = name[name.length - 1] // yes, that's the only way, and yes, this is dumb af

    print("Last character is $lastChar, and the length is ${name.length}") // templates say hello

    // Arithmetic operators (+, -, *, /, %)
    val a = 5F
    val b = 2F
    var result: Float = a / b
    print(result)

    //Comparison operators (==, !=, >, <, >=, <=)
    val b1 = true
    val b2 = false
    val comp1 = b1 > b2
    val comp2 = b1 <= b2
    val isEqual = comp1 == comp2
    print("isEqual is $isEqual")

    // Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3 // perform as you'd expect them to
    myNum -= 2
    myNum *= 2
    myNum /= 3
    println("myNum is $myNum")

    /* Increment(++) and decrement(--) operators*/
    myNum++
    println("myNum is $myNum")
    println("myNum is ${myNum--}") // important: if the decrement operator goes after the variable, it'll execute at the end of the line, as the last command
    println("myNum is ${--myNum}") // if placed before, the decrement operator wil execute right at the point it's placed
}
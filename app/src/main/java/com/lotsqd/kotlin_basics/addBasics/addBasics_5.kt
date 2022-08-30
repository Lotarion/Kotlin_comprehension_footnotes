package com.lotsqd.kotlin_basics.addBasics

fun main () {

}
// the "public" modifier is redundant,
// because it is is set by default
// v
public fun add (a: Int, b: Int): Int {
    return a+b
}

// very private useless class :D
private class Example {
    private val x = 1

    private fun dosmth() {
        print("i lifted a finger, is that enough?")
    }
}

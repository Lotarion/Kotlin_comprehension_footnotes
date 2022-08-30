package com.lotsqd.kotlin_basics.KotlinBasics

fun main() {
    for (i in 1 until 20) {
        /*
        10/2 = 5,
        11/2 is 5.5, which is 5 in terms of an int
        */
        if (i / 2 == 5) continue
        print("$i ")
    }
    print("\nDone with the loop")
    daFunction()
    val c = addUp(4, 6)
    print("$c")
    print("${avg(4.20f, 13.37f)}")

    var tmpbool = true
    var Name: String = "Daniel"
    // Name = null => compilation error
    var nulName: String? = "Dani"
    if (tmpbool) {
        nulName = null
    }
    nulName?.let { println(it.length) }

    // ?: Elvis operator
    val name = nulName ?: "Guest"
    print("name is ${name.lowercase()}.")

    // old and smelly way
    /*
    if (nulName != null) {
        val len2 = nulName.length
    } else {
        null
    }*/
}

fun daFunction() {
    println("daFunction was executed")
}

fun addUp (a: Int, b: Int) : Int {
    return a + b
}
fun avg(a: Float, b: Float) : Double {
    return (a + b) / 2.0
}

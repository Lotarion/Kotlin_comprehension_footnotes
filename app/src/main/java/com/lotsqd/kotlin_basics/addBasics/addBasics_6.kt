package com.lotsqd.kotlin_basics.addBasics

fun main() {
    // nested class must be initialised
    val obj = Outer.Nested() // object creation

    println(obj.description)


    obj.foolery()
    println("-------------------------")

}

class Outer {
    var name: String = "Donut of doom"
    class Nested {
        var description: String = "code inside the nested class"
        private var id: Int = 54896455
        fun foolery() {
            // print("name is $name") //can't access the outer class member
            println("Id is $id")
        }
    }
}

class Outerr {
    var name: String = "Donut of doom"
    inner class Inner {
        private var description: String = "code inside the nested class"
        private var id: Int = 54896455
        fun foolery() {
            print("name is $name") //now can access the outer class member
            println("Id is $id")
        }
    }
}
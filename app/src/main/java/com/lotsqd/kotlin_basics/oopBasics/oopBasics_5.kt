package com.lotsqd.kotlin_basics.oopBasics

// An abstract class cannot be instantiated
// (you cannot create objects of an abstract class).
// However, you can inherit subclasses from can them.
// The members (properties and methods) of an abstract class are non-abstract
// unless you explicitly use the abstract keyword to make them abstract.
abstract class Mammal(val name: String, val origin: String,
                      val weight: Double) {   // Concrete (Non Abstract) Properties

    // Abstract Property (Must be overridden by Subclasses)
    abstract var maxSpeed: Double

    // Abstract Methods (Must be implemented (overridden) by Subclasses)
    abstract fun move()
    abstract fun breath()

    // Concrete (Non Abstract) Method
    fun displayDetails() {
        print("Name: $name \n" +
                "Origin: $origin \n" +
                "Weight: $weight \n" +
                "Max Speed: $maxSpeed \n")
    }
}
class Human (name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight) {
    override fun move() {
        println("bipedal movement with a max speed of $maxSpeed km/h")
    }

    override fun breath() {
        println("breath through either the nose or the mouth")
    }
}

class Elephant (name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight) {
    override fun move() {
        println("Quadrupedal movement with a speed of $maxSpeed km/h")
    }

    override fun breath() {
        println("breath through the trunk")
    }
}

fun main() {
    val human = Human("Bogdan", "Russia", 76.0, 22.0)
    val elephant = Elephant("Rupert", "Kenya", 5542.0, 24.0)

    human.move()
    elephant.move()
    println()
    human.breath()
    elephant.breath()
    println()
    human.displayDetails()
    elephant.displayDetails()
}
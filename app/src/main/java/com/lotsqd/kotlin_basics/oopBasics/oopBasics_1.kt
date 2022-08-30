package com.lotsqd.kotlin_basics.oopBasics

fun main() {
    val bogdanStep = Person("Bogdan", "Stepanov", 22)
    bogdanStep.hobby = "playing video games"
    bogdanStep.stateHobby()
    val default = Person()
    default.hobby = "playing football"
    default.stateHobby()
//    val defaultName = Person(lastName = "Stepanov")
}

class Person (name: String = "Ivan", surname: String = "Ivanov") {
    var age: Int? = null
    var hobby: String = "watching Netflix"
    var firstName: String
    var lastName: String


    // Member: secondary Constructor
    constructor(name: String, surname: String, age: Int?)
            : this(name, surname) {
        this.age = age
        println("Initialized a new Person object with firstName = $name, lastName = $surname, and age of $age years")
    }

    // Initializer block
    init {
        this.firstName = name
        this.lastName = surname
        println("Initialized a new Person object with name = $name and surname = $surname")
    }

    // Member Functions, aka Methods
    fun stateHobby () {
        println("${this.firstName} ${this.lastName}'s hobby is ${this.hobby}")
    }
}

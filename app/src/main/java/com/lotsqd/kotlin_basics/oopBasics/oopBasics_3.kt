package com.lotsqd.kotlin_basics.oopBasics

data class User(val id: Long, var login: String)

fun main() {
    val user1 = User(id = 1, login = "Bogdan")
    val user2 = User(id = 2, login = "Michael")
    val updUser1 = user1.copy(login = "Bogdan_Stepanov")

    var login = user2.login

    var (id, name) = user1

    println("User details: $user1")
    println("User details: $updUser1")
    println()
    println("component1 is: ${updUser1.component1()}") // prints the first parameter
    println("component2 is: ${updUser1.component2()}") // prints the second parameter
    println()
    println("id = $id")
    println("name = $name")
}
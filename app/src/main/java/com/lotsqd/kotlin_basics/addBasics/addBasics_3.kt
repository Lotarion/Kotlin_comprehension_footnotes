package com.lotsqd.kotlin_basics.addBasics

fun main() {
    val fruits = setOf("Apple", "Peach", "Grape", "Grape", "Mango", "Peach")
    print(fruits.toSortedSet())

    val moreFruits = fruits.toMutableSet()
    moreFruits.add("Pear")
    moreFruits.add("Watermelon")
    moreFruits.add("Apple")
    println(moreFruits.elementAt(4))

    val daysOfTheWeek = mapOf(null to "Value_at_address_null", "Tue" to "Tuesday", "Wed" to "Wednesday", "Mon" to "Monday")
    println(daysOfTheWeek["Wed"])

    for (key in daysOfTheWeek.keys) {
        println("$key is a key to ${daysOfTheWeek[key]}")
    }

    val fruitsMap = mapOf(
        "Nice" to Fruit("Kiwi", 2.5),
        "Awful" to Fruit("Pumpkin", 3.2)
    )

    val moreDaysOfTheWeek = daysOfTheWeek.toMutableMap()
    moreDaysOfTheWeek["Thu"] = "Thursday"
    moreDaysOfTheWeek["Fri"] = "Friday"

    println()
    println(moreDaysOfTheWeek)

    val tmplist = moreDaysOfTheWeek.entries.toMutableList()
    print(tmplist[0])
}

data class Fruit (val name: String, val price: Double)
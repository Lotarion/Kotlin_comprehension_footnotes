package com.lotsqd.kotlin_basics.addBasics

fun main() {
    val months = listOf("January", "February", "March", "July")
    val mixList = listOf(1, 2, 3, false, "placeholder")

    println(mixList.size)
    printList(mixList, ", ", true)
    println("---------------------------------")

    val monthsExpandable = months.toMutableList()
    val newMonths = listOf("April", "May", "June")

    monthsExpandable.addAll(monthsExpandable.size-1, newMonths)
    println(monthsExpandable)
    monthsExpandable.add("November")
    monthsExpandable.add("December")
    monthsExpandable.addAll(monthsExpandable.size-2, listOf("August", "September", "October"))
    println(monthsExpandable)
    println("---------------------------------")

    val weekdays = mutableListOf<String>("Monday", "Tuesday", "Wednesday", "Thursday")
    weekdays[2] = "Dudesday"
    println(weekdays)

    val removeList = mutableListOf<String>("Monday", "Wednesday")
    weekdays.removeAll(removeList)
    println(weekdays)
}

fun printList (list: List<Any>, spacer: String, endOfLine: Boolean) {
    print("[ ")
    for (i in list) {
        print("$i$spacer")
    }
    for (a in 1..spacer.length) {
        print("\b")
    }
    print(" ]")
    if (endOfLine) print("\n")
}

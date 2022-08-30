package com.lotsqd.kotlin_basics.addBasics

fun main () {
    val list: List<Int> = listOf(1, 2, 3, 4, 5)
    val arrlist: ArrayList<Int> = ArrayList<Int>(5)

    arrlist.addAll(list)

    print(arrlist.average())
}
package com.lotsqd.kotlin_basics.addBasics

fun main () {
     // Lambda expression: {variables? -> lambda_body}

    // Regular function call:
    println(addNumber(10, 5))

    // Lambda expression call (cryptic):
//          |explicit  |explicit |
//   lambda |parameter | output  | parameters  |  lambda
//     name |  types   |  type   | declaration |   body
//       v       v          v       v        v      v
    val sum: (Int, Int) -> Int = {a: Int, b: Int -> a+b}
    println(sum(10, 5))
    println()
    //even shorter lambda call:
    val printsum = {a:Int, b:Int -> println(a+b)}
    printsum(10, 5)
}
// bulky, but easy to read regular function
fun addNumber (a: Int, b: Int): Int {
    return a+b
}
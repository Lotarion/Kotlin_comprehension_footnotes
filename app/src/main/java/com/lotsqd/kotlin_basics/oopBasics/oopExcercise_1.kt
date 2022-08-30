package com.lotsqd.kotlin_basics.oopBasics

fun main(){
    val phone1 = Smartphone("Android", "Samsung", "Galaxy S20U")
    val phone2 = Smartphone("iOS", "Apple", "iPhone X")
    val phone3 = Smartphone("Android", model = "M625")
}
class Smartphone (osName: String = "Unknown OS", brand: String = "Unknown brand", model: String = "Unknown model") {
    init {
        println("")
        println("Object Smartphone initialised with these specifications:")
        println("OS: $osName")
        println("Brand: $brand")
        println("model: $model\n")
    }
}
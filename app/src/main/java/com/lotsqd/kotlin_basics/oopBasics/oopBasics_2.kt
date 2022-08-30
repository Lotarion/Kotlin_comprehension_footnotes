package com.lotsqd.kotlin_basics.oopBasics


fun main() {
//    val myCar = Car("David", "Alpha Romeo", "m5ag",235)
//    println("The brand is ${myCar.brand}")
//    myCar.maxSpeed = 250
//    println("Max speed is ${myCar.maxSpeed}")
//    println("Model: ${myCar.model}\n")
//    val defaultCar = Car()
}

//class Car(owner: String = "Unknown", brand: String = "Unknown", model: String = "Unknown", maxSpeed: Int = 0) {
//    var owner: String
//    var brand: String
//        // this is a custom getter
//        get() {
//            return field.lowercase()
//        }
//    var maxSpeed: Int = 0
//        set(value){
//            field = if (value < 0) throw IllegalArgumentException("Expected positive number or 0") else value
//        }
//    var model: String = "Unknown"
//        private set(value) {
//            field = value.uppercase()
//        }
//
//    init {
//        this.owner = owner
//        this.brand = brand
//        this.model = model
//        this.maxSpeed = maxSpeed
//        print("Initialised a new Car object with following parameters:\n" +
//                "    Owner: $owner\n" +
//                "    Brand: $brand\n" +
//                "    Model: $model\n" +
//                "    MaxSpeed: $maxSpeed\n" +
//                "------------------\n")
//    }
//}
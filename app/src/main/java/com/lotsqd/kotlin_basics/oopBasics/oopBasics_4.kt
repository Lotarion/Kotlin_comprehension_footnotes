package com.lotsqd.kotlin_basics.oopBasics

interface Driveable{
    val maxSpeed: Int
    fun drive(): String
    fun brake() {
        println("The car is braking")
    }
}

open class Car(brand: String = "Unknown", model: String = "Unknown", override val maxSpeed: Int): Driveable{
    open var range: Double = 100.0

    fun extendRange(amount: Double) {
        if (amount > 0) range += amount
    }

    override fun drive(): String = "drove for $range km (interface fun)"

    open fun drive(distance: Double) {
        println("drove for $distance km")
    }
}

class ElectricCar(brand: String = "Unknown", model: String = "Unknown", batteryLevel: Double, maxSpeed: Int) : Car(brand, model, maxSpeed) {
    override var range = batteryLevel * 5.5

    var chargerType: String = "E24"

    override fun drive(distance: Double) {
        println("drove for $distance km with 0 carbon emission :)")
    }
    fun driveMax() {
        println("drove for $range km")
    }

    override fun brake() {
        super.brake()
        println("braking the servomotors")
    }
}

fun main() {
    val aCar = Car("Alpha Romeo", "S129", 255)
    val aECar = ElectricCar("Audi", "R8 e-tron", 180.0, 270)

    aCar.brake()
    aECar.brake()

    aECar.drive(200.0)
}
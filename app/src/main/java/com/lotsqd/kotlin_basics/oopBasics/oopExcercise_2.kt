package com.lotsqd.kotlin_basics.oopBasics

import kotlin.properties.Delegates

fun main(){
    val phone1 = MobilePhone("Android", "Samsung", "Galaxy A30", 31)
    phone1.chargeBattery(30)
}

class MobilePhone(osName: String, brand: String, model: String, battery: Int){
    var battery by Delegates.notNull<Int>()

    init {
        this.battery = battery
        print("Initialised a new MobilePhone object with following parameters:\n" +
                "    OS: $osName\n" +
                "    Brand: $brand\n" +
                "    Model: $model\n" +
                "    Charge level: $battery%\n" +
                "------------------\n")
    }

    fun chargeBattery(chargeAmount: Int) {
        println("Phone had $battery% before charging")
        battery += chargeAmount
        println("charged by $chargeAmount%")
        println("Phone has $battery% after charging")
    }
}
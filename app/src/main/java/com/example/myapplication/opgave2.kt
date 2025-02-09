package com.example.myapplication

// Parent class: Computer
open class Computer(
    val brand: String,
    val processor: String,
    val ramSizeGB: Int
) {
    // Method to display computer details
    fun displayDetails() {
        println("Brand: $brand, Processor: $processor, RAM: ${ramSizeGB}GB")
    }

    // Method to perform a basic task
    fun performTask(task: String) {
        println("$brand is performing task: $task")
    }
}

// Child class: Laptop
class Laptop(
    brand: String,
    processor: String,
    ramSizeGB: Int,
    val batteryLifeHours: Double // Additional property
) : Computer(brand, processor, ramSizeGB) {

    // Additional method for Laptop
    fun checkBatteryLife() {
        println("$brand laptop has a battery life of $batteryLifeHours hours.")
    }
}

// Child class: SmartPhone
class SmartPhone(
    brand: String,
    processor: String,
    ramSizeGB: Int,
    val screenSizeInches: Double // Additional property
) : Computer(brand, processor, ramSizeGB) {

    // Additional method for SmartPhone
    fun makeCall(contact: String) {
        println("$brand smartphone is calling $contact.")
    }
}

fun main() {
    // Create a Laptop object
    val laptop = Laptop("Dell", "Intel i7", 16, 8.5)
    laptop.displayDetails()
    laptop.checkBatteryLife()
    laptop.performTask("Running a program")

    println() // For spacing

    // Create a SmartPhone object
    val smartphone = SmartPhone("Apple", "A15 Bionic", 8, 6.1)
    smartphone.displayDetails()
    smartphone.makeCall("John Doe")
    smartphone.performTask("Playing music")
}

//Lavet i samarbejde med deepseek, for at få en bedre forståelse.
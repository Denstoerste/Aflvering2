package com.example.myapplication

class Employee(
    val firstName: String,
    val lastName: String,
    monthlySalary: Double
) {
    var monthlySalary: Double = if (monthlySalary > 0) monthlySalary else 0.0

    fun calculateYearlySalary(): Double {
        return monthlySalary * 12
    }

    fun giveRaise(percentage: Double) {
        monthlySalary += monthlySalary * (percentage / 100)
    }
}

fun main() {
    // Create two Employee objects
    val employee1 = Employee("John", "Doe", 3000.0)
    val employee2 = Employee("Jane", "Smith", -500.0) // Negative salary will be set to 0.0

    // Display yearly salaries
    println("${employee1.firstName} ${employee1.lastName}'s yearly salary: $${employee1.calculateYearlySalary()}")
    println("${employee2.firstName} ${employee2.lastName}'s yearly salary: $${employee2.calculateYearlySalary()}")

    // Give each employee a 10% raise
    employee1.giveRaise(10.0)
    employee2.giveRaise(10.0)

    // Display yearly salaries after the raise
    println("\nAfter 10% raise:")
    println("${employee1.firstName} ${employee1.lastName}'s yearly salary: $${employee1.calculateYearlySalary()}")
    println("${employee2.firstName} ${employee2.lastName}'s yearly salary: $${employee2.calculateYearlySalary()}")
}

//Lavet sammen med Deepseek for bedre forståelse
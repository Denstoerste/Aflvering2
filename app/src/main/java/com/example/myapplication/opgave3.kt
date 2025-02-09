package com.example.myapplication

// Base class: Product
open class Product(
    val name: String,
    val price: Double,
    val quantity: Int
) {
    // Function to identify product category
    open fun identifyProductCategory() {
        println("I am a generic product.")
    }
}

// Subclass: Shoe
class Shoe(
    name: String,
    price: Double,
    quantity: Int
) : Product(name, price, quantity) {

    // Override function for Shoe
    override fun identifyProductCategory() {
        println("I am a shoe.")
    }
}

// Subclass: TShirt
class TShirt(
    name: String,
    price: Double,
    quantity: Int
) : Product(name, price, quantity) {

    // Override function for TShirt
    override fun identifyProductCategory() {
        println("I am a T-shirt.")
    }
}

// Subclass: Book
class Book(
    name: String,
    price: Double,
    quantity: Int
) : Product(name, price, quantity) {

    // Override function for Book
    override fun identifyProductCategory() {
        println("I am a book.")
    }
}

fun main() {
    // Create objects of each subclass
    val shoe = Shoe("Running Shoes", 59.99, 10)
    val tShirt = TShirt("Cotton T-Shirt", 19.99, 20)
    val book = Book("Kotlin Programming", 29.99, 5)

    // Call the overridden function for each object
    shoe.identifyProductCategory()  // Output: I am a shoe.
    tShirt.identifyProductCategory() // Output: I am a T-shirt.
    book.identifyProductCategory()   // Output: I am a book.
}

//Lavet i samarbejde med deepseek, for at få en bedre forståelse.
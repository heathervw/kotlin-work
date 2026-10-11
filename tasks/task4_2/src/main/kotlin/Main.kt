// Task 4.2: use of if and ranges
// Orering a pizza

fun main() {
    println("A. Meat Lovers Pizza")
    println("B. Vggie Special Pizza")
    println("C. Sourdough Margherita Pizza")
    println("D. Classic Cheese Pizza")

    println("Chose your pizza (a-d): ")
    val pizzaChoice = readln().lowercase() // readln) always returns a string
    println(pizzaChoice)

    if (pizzaChoice.length == 1 && pizzaChoice in "a".."d") {
        println("Thanks for chooseing $pizzaChoice, Order Accepted!")
    } else {
        println("Please choose an option from our piza menu")
    }
}

// Task 7.3.1: list element access

fun main() {
    val numbers = listOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println(numbers.slice(2..4))
    println(numbers[0])
    println(numbers.first())
    println(numbers.last())
    //These last two do not work because list formed with listOf or list constructor  are immutable
    // must use MutableList<> or mutableListOf()
    //mutableListOf is the best way to create an empty mutable list but must supply a type in brackets
    //numbers[0] = 4
    //println(numbers.add(1))
}



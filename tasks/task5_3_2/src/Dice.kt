// Task 5.3.2: rollDice() function
import kotlin.random.Random
import kotlin.system.exitProcess

fun rollDice(sides: Int, dice: Int) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling $dice d$sides dice")
    }
    else {
        println("Error: cannot have a $sides-sided die")
        exitProcess(1)
    }
        var total = 0
        repeat(dice) {
            val result = Random.nextInt(1, sides + 1)
            println("You rolled $result")
            total += result
        }

        println("Your total is  $total")
    }
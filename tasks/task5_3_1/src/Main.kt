// Task 5.1.2: main program
import kotlin.system.exitProcess

fun main (args: Array<String>) {
    if (args.size != 1) {
       rollDie(6)
    }
   else {
        val dice = args[0].toInt()
        rollDie(dice)
    }
}
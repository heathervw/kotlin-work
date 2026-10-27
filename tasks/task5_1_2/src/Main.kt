// Task 5.1.2: main program
import kotlin.system.exitProcess

fun main (args: Array<String>) {
    if (args.size != 1) {
        exitProcess(1)
    }
    val dice = args[0].toInt()
    rollDie(dice)
}
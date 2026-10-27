// Task 5.2.1: main program
import kotlin.system.exitProcess

fun main (args: Array<String>) {
    if (args.size != 1) {
        exitProcess(1)
    }
    val radius = args[0].toDouble()
    println(circleArea(radius))
    println(circleParameter(radius))
}
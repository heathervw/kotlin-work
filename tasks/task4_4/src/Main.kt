// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error key in the initial, max and increment temperature")
        exitProcess(1)
    }

    var initTemp = args[0].toFloat()
    val maxTemp = args[1].toFloat()
    val incrementTemp = args[2].toFloat()

    while (initTemp != maxTemp) {
        val farenheit = (initTemp * 9/5) + 32
        println("%5.1f %5.1f".format(initTemp, farenheit))
        initTemp += incrementTemp
    }
}


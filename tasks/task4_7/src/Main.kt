// Task 4.7: finding the longest line in a file
import kotlin.system.exitProcess
import kotlin.io.path.Path
import kotlin.io.path.writeLines
import kotlin.io.path.useLines

fun main(args: Array<String>) {

    if (args.size != 1) {
        println("Error")
        exitProcess(1)
    }

    // val filePath = Path(args[0])
    // val lines = listOf("xxx", "xx", "xxxxx", "xxx")
    // filePath.writeLines(lines)

    var lineCounter = 0
    var longestLen = 0
    var longestLineNum = 0
    filePath.useLines {
        for (line in it) {
            val lineLength = line.length
            lineCounter += 1
            if (lineLength > longestLen) {
                longestLen = lineLength
                longestLineNum = lineCounter
            }
        }
        println("Line %s is the longest (length = %s)".format(longestLineNum, longestLen))
    }

}
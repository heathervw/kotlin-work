// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.system.exitProcess
fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    val num1 = args[0].toFloat()
    val num2 = args[1].toFloat()
    val num3 = args[2].toFloat()

     val result = 0.5f * (num1 + num2  + num3)
     System.out.printf("Area = %.5f", result)

}
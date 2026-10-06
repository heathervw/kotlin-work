// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle
import kotlin.math.sqrt // imports swuare root
import kotlin.system.exitProcess // imports the  kotlin library system exit function

fun main(args: Array<String>) {  // allows for arguement input
    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    val num1 = args[0].toFloat() // converts string type to float
    val num2 = args[1].toFloat()
    val num3 = args[2].toFloat()

    val s = 0.5f * (num1 + num2  + num3) // semiparameter
    val result = s * ((s - num1) * (s - num2) * (s - num3))
    val area = sqrt(result)
    System.out.printfln("Area = %.5f\n", area) //formatted float output

}
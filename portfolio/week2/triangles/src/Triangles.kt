// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle:Triangle): Boolean {

    val num1 = triangle.first
    val num2 = triangle.second
    val num3 = triangle.third

    val sum1 = num2 + num3
    val sum2 = num1 + num3
    val sum3 = num1 + num2

    return num1 < sum1 && num2 < sum2 && num3 < sum3
}

fun triangleArea(triangle:Triangle): Double {

    val num1 = triangle.first
    val num2 = triangle.second
    val num3 = triangle.third

    val s = 0.5 * (num1 + num2 + num3) // semiparameter
    val result = s * ((s - num1) * (s - num2) * (s - num3))
    val area = sqrt(result)
    return area
}
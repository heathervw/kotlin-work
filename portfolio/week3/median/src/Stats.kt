// Task 7.7.1: statistics functions

typealias Data = List<Float>

fun min(data:Data) {
    println("The minimum is ${data.min()}")
}

fun max(data:Data) {
    println("The maximun is ${data.max()}")
}

fun mean(data:Data) {
    println("The average is ${data.average()}")
}

fun median(data:Data) : Float {
    val sort = data.sorted()
    val  med =  when {
        sort.isEmpty() -> throw IllegalArgumentException()
        sort.size % 2 == 0 -> ((sort[sort.size / 2]) + (sort[sort.size / 2 - 1])) / 2
        else -> sort[sort.size / 2]
        }

    println("The median is $med")
    return med
}





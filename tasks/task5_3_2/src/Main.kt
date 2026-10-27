// Task 5.3.2: main program
fun main (args: Array<String>) {
    if (args.size != 2) {
        rollDice(6,2)
    }
    else {
        val sides = args[0].toInt()
        val dice = args[1].toInt()
        rollDice(sides, dice)
    }


}



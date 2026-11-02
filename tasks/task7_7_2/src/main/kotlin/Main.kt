// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)
    val contactInfo = createDatabase()
    contactInfo.load(CSV_FILENAME)
    contactInfo.save(CSV_FILENAME)

}

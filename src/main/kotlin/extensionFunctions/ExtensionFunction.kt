package extensionFunctions

fun main() {
    fun Int.calculatePower(): Int = this * this
    println(4.calculatePower())
    fun String.startsWithA(): Boolean = this[0].toUpperCase() == 'A'
    var name: String = "Muala"

    println(name.startsWithA())
    println("Amerika".startsWithA())
        //removeFirstLastChar()

}
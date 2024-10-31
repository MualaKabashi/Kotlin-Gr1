package singleton

class CompanionObject {
    companion object {
        var defaultValue = 12

        fun sayHello() {
            println("Helloooooo!")
        }
    }
}

fun main() {
    println(CompanionObject.defaultValue)
    CompanionObject.sayHello()
}
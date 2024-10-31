package interfaces

interface Animal {
    var numberOfLegs: Int
    fun move()
    fun communicate()
}


class Dog(override var numberOfLegs: Int) : Animal {
    //leave inside class
    // override var numberOfLegs: Int =1
    override fun communicate() {
        saySomething()
    }
    override fun move() {
        run()
    }
    private fun saySomething() {
        println("HUM HUMM!")
    }

    private fun run() {
        println("Running!!!!!")
    }
}

fun main() {
    var dog = Dog(4)
    dog.numberOfLegs = 12
}
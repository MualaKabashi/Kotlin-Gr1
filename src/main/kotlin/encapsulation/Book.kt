package encapsulation

class Book(name: String = "", numberOfPages: Int = 0) {
    var bookName = name
        set(value) {
            println("The name is changing. The new is $value")
            field = value
        }

    var number = numberOfPages
        set(value) {
            field = if (value < 0) {
                println("Imaginary book!")
                0
            } else {
                value
            }
        }
}
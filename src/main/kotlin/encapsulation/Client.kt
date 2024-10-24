package encapsulation

class Client {
    var name: String = "Muala"
    var surname: String = "Kabashi"

    var information: String = ""
        get() = "Information: $name, $surname"
        set(value) {
            field = value
        }


    var age: Int = 0
        get() = field
        set(value) {
            field = if (value < 0) {
                println("Age cannot be less than 0")
                0
            } else {
                value
            }
        }


    var address: String = "test"
        get() {
            println("Address is $field")
            return field
        }
        set(value) {
            println("The old value is $field the new value is $value")
            field = value
        }

}
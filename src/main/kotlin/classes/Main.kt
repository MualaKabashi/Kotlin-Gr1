package classes


fun main() {

    //object
    var size = Size()

    println("${size.height} ${size.width}")

    //set public field values
    size.height = 12
    size.width = 3

    //get public fields values
    println("${size.height} ${size.width}")

    println("-----------------------------------")
    var desk = Desk("wood", 100)

    desk.material = "plastic"
    desk.deskInformation()

    println(desk.width)


    println("----------------------")
    //constructor with arguments
    var laptop = Laptop(speed = 10, strength = 10.0, name = "Macbook M1 Air")
    laptop.giveInformation()

    //constructor without arguments
    var laptop1 = Laptop()
    laptop1.name = "Lenovo"
    laptop1.giveInformation()

    println("------------------------------")

    var bankInfo = BankInformation(name = "Muala", isValid = true, cardNumber = 4564534, amount = 12.0)
    var bankInfo1 = BankInformation(name = "Muala", 12131, false, amount = 125.0)

}








package classes

import encapsulation.Book
import encapsulation.Client


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

    println("------------------------------------------")

    var client = Client()
    println(client.information)
    client.name = "Ema"
    client.surname = "Gashi"
    println(client.information)

    client.age = -12

    println(client.age)
    client.age = 25
    println(client.age)


    client.address = "Dhimiter Fullani"
    client.address


    var book = Book("Game of Thrones", -1)
    book.bookName = "Test"
    var book1 = Book("It ends with us", 100)
    book.number = -123


















}









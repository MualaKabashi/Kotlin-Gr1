package kotlin_intro

import kotlin.math.sqrt

fun main() {
    var age: Int = 40
    println(age)

    age += 10
    println(age)

    age *= 2
    println(age)


    var name: String = "Muala"
    println(name[0])
    println(name.substring(4, name.length))
    println(name.contains("Hello"))
    println(name.toUpperCase())
    println(name.toLowerCase())
    println(name)

    name += " Kabashi"
    println(name)

    var number: Int = 25
    var squareRoot = sqrt(number.toDouble())

    println(number)
    println(squareRoot)

    println(name + number)

    val city = "Prishtine"
    val temperature = 22.0
//    println("Temperature ne " + city + " eshte "+ temperature)
    println("Temperature ne $city eshte $temperature")
}
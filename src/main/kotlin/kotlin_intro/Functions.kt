package kotlin_intro

import kotlin.math.sqrt

fun main() {
    sayHello()
    sayHelloFriend("Era")
    userFavoriteProgrammingLanguage("Muala", "Kotlin")
    println(calculateAverage(10.0, 9.5))
    println(calculateSquareRoot(25))
    println(sum(4, 5))
    println(concatStrings("hello", "world!"))
    println(concat("hello", " world!"))
    calculate(10.0, 9.8)
}


fun sayHello(): Unit {
    println("Hello class!")
}


fun sayHelloFriend(name: String): Unit {
    println("Hello $name")
}

fun userFavoriteProgrammingLanguage(name: String, favoriteLanguage: String): Unit {
    println("$name's favorite language is $favoriteLanguage")
}


fun calculateAverage(subjectOneGrade: Double, subjectTwoGrade: Double): Double {
    return (subjectOneGrade + subjectTwoGrade) / 2
}

fun calculateSquareRoot(number: Int): Double {
    return sqrt(number.toDouble())
}

fun sum(a: Int, b: Int): Int = a + b

fun concatStrings(firstValue: String, secondValue: String): String = "$firstValue $secondValue"

fun concat(item: String, item2: String): String {
    return item + item2
}


fun calculate(number1: Double, number2: Double) {
    var average = calculateAverage(number1, number2)
    var squareRoot = calculateSquareRoot(average.toInt())

    var number = calculateSquareRoot(calculateAverage(number1, number2).toInt())
    println(number)
    println(squareRoot)
}














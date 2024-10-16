package kotlin_intro

import java.util.*

fun main() {
    calculate()
    println(division(number2 = 2, number1 = 100))
}

fun sum(number1: Int, number2: Int, number3: Int) = number1 + number2 + number3

fun calculate() {
    val scanner = Scanner(System.`in`)
    println("Shkruani numrin e pare: ")
    val number1 = scanner.nextInt();
    println("Shkruani numrin e dyte: ")
    val number2 = scanner.nextInt();
    println("Shkruani numrin e trete: ")
    val number3 = scanner.nextInt();

    println(sum(number1 = number1, number2 = number2, number3))
}


fun division(number1: Int = 10, number2: Int) = number1 / number2
package kotlin_intro

import java.util.*

object JavaCodeToKotlin {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Ju lutem shkruani emrin tuaj: ")
        val name = scanner.nextLine()
        println("Ju lutem shkruani numrin personal: ")
        val personalNumber = scanner.nextLong()
        println("Ju lutem shkruani mesataren tuaj: ")
        val average = scanner.nextDouble()
        System.out.printf("Name: %s PersonalNumber: %d Average: %.2f", name, personalNumber, average)
    }
}
package kotlin_intro

import java.util.*

fun main() {
    println(rockPaperScissorsGame())
}

fun rockPaperScissorsGame() :String {
    var userChoice = ""
    var computerChoice = ""

    println("Rock, paper,scissors! Choose one!")
    val scanner = Scanner(System.`in`)
    userChoice = scanner.nextLine().trim().toUpperCase()

    val randomNumber = (1..3).random()

    computerChoice = when (randomNumber) {
        1 -> "ROCK"
        2 -> "PAPER"
        3 -> "SCISSORS"
        else -> ""
    }
    println("Computer chose: $computerChoice")
    println("You chose: $userChoice")

    val winner = when {
        (userChoice == computerChoice) -> "Tie!"
        userChoice == "ROCK" && computerChoice == "SCISSORS" -> "User won!"
        userChoice == "SCISSORS" && computerChoice == "PAPER" -> "User won!"
        userChoice == "PAPER" && computerChoice == "ROCK" -> "User won!"
        else -> "Computer won!"
    }

    return winner
}

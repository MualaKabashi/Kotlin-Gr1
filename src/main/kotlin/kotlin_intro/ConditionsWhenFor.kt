package kotlin_intro

fun main() {
    ifStatement(120)
    ifStatement(52)
    ifStatement(10)

    println(ifExpression(10, 20))
    println("------------------------------------------")
    checkAge(12)
    checkAge1(12)
    println("------------------------------------------")
    checkAge(45)
    checkAge1(45)
    println("------------------------------------------")
    println(isVowel('a'))
    println(isVowel('z'))
    println(isVowel('A'))
    println(isVowel('H'))
    println("--------------------------")
    checkGrade("Medina", 90)
    checkGrade("Ema", 76)

    repeatLoop(5)
    loopForAlphabet()
    println("--------------------------")
    loopForAlphabetReverse()
    numbersReverse()

    println()
    println("------------------------")
    calculate(number = 10, number2 = 2, '+')
    calculate(number = 10, number2 = 2, '/')
    calculate(number = 10, number2 = 2, '_')
    println("---------------------------------")
    multiplyTable(5)
    println("-------------")
}


fun ifStatement(number: Int) {
    if (number > 100) {
        println("Number is grater than 100!")
    } else if (number == 100) {
        println("Number is 100!")
    } else {
        println("Number is less than 100!")
    }
}

fun ifExpression(number1: Int, number2: Int): String {
    val graterNumber = if (number1 > number2) {
        println("Choose number1")
        "number1"
    } else {
        println("Choose number2")
        "number2"
    }
    return graterNumber
}

fun checkAge(age: Int) {
    if (age < 18) {
        println("Je shume i ri per pune!")
    } else {
        println("Puno!")
    }
}


fun checkAge1(age: Int) =
    if (age < 18) println("Je shume i ri per pune!") else println("Puno!")


fun isVowel(character: Char): Boolean {
    val vowels = "aeiouy"
    return if (vowels.contains(character.toLowerCase())) {
        true
    } else {
        return false
    }
}

//check grade
fun checkGrade(name: String, score: Int) {
    if (score in 51..60) {
        println("$name's grade is 6")
    } else if (score in 61..70) {
        println("$name's grade is 7")
    } else if (score in 71..80) {
        println("$name's grade is 8")
    } else if (score in 81..90) {
        println("$name's grade is 9")
    } else if (score in 91..100) {
        println("$name's grade is 10")
    } else if (score > 100) {
        println("invalid score!")
    } else {
        println("See you in exam!")
    }
}


fun repeatLoop(number: Int) {
    repeat(number) {
        println("Hi!")
    }
}


fun loopForAlphabet() {
    for (element in 'a'..'z') {
        print(element)
    }
}

fun loopForAlphabetReverse() {
    for (element in 'z' downTo 'a')
        print(element)
}

fun numbersReverse() {
    for (number in 100 downTo 10)
        print(number)
}

//Switch==WHEN
fun calculate(number: Int, number2: Int, operator: Char) {
    when (operator) {
        '+' -> println("${number + number2}")
        '-' -> println("${number - number2}")
        '*' -> println(number * number2)
        '/' -> println(number / number2)
        else -> println("Unknown operator!")
    }
}


fun multiplyTable(number: Int) {
    for (i in 1..10) {
        println("$number * $i = ${number * i}")
    }
}

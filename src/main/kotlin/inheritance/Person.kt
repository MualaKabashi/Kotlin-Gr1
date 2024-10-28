package inheritance

open class Person(var name: String, var age: Int, var height: Double) {
    fun printInformation() = println("Information: $name, $age, $height")
}


class Student(
    var firstName: String, var studentAge: Int,
    var studentHeight: Double, var averageGrade: Double
) : Person(firstName, studentAge, studentHeight)


fun main() {
    var student = Student(
        "Muala", 121,
        1233.0, 9.2
    )
    student.printInformation()
}
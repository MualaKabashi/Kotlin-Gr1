package collections

fun main() {
    var set1 = setOf("hi", "hello", "hi")
    println(set1)
    var set2 = mutableSetOf("hello", "hi")
    set2.add("hellooooo")
    println(set2)


    var map = mapOf("Muala" to 1, "Yll" to 2,
        "Someja" to 3, "Someja" to 5, "Dea" to 1)
    println(map)

    var map1 = mutableMapOf("hi" to 12)
    map1["hello"] = 123
}
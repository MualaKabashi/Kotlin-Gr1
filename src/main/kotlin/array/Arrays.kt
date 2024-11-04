package array

fun main() {
    var integerArray = intArrayOf(1, 2, 3, 4, 5)
    println(integerArray.joinToString())
    var doubleArray = doubleArrayOf(1.0, 2.0, 3.0)
    println(doubleArray.joinToString())

    var doubles = DoubleArray(5)
    var integers = IntArray(4)

    println(doubles.joinToString())
    println(integers.joinToString())

    doubles[0] = 12.0
    doubles[doubles.size - 1] = 25.0
    integers[2] = 52

    println(doubles.joinToString())
    println(integers.joinToString())


    var array1 = intArrayOf(1, 2, 3)
    var array2 = intArrayOf(1, 3, 2)
    println("-------------------------------")
    println(array1.contentEquals(array2))

    var simpleArray = intArrayOf(7, 8, 9)
    var similarArray = intArrayOf(7, 8, 9)

    var newArray = simpleArray
    println(simpleArray == simpleArray)
    println(simpleArray == similarArray)
    println(newArray == simpleArray)


    var items = arrayOf<Any>("item1", "item2", "item3", 12, 'a', 12.0)
    var items1 = arrayOf<String?>("item1", "item2", "item3", null)


}
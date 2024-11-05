package collections

fun main() {
    var list = listOf("item1", "item2")
    println(list[0])
    println(list[list.size - 1])

    var mutableList = mutableListOf("item10", "item12")
    mutableList[0] = "item20"
    println(mutableList)
    mutableList.add("item156")
    println(mutableList)
    mutableList.remove("item12")
    mutableList.removeAt(1)
    println(mutableList)


    var newList = List(4) { 0 }
    println(newList)
    var newList1 = List(4) { "hi" }
    println(newList1)

    println(newList1.joinToString("->"))
//    var combine = newList + newList1
    var combine = newList.plus(newList1)

    println(combine)

    var list12 = mutableListOf(1, 2, 3)
    val list1 = listOf(1, 2, 3)

    list12.add(23324)

    var list124 = MutableList(2) { 2 }
    list12 = list124
    println(list124)
//    list124.clear()
//    println(list124)

    list124.removeAll(listOf(2))
    println(list124)


    var longList = listOf(1, 2, 5, 8, 7, 9)
    var subList = longList.subList(1, 5)
    println(subList)

    println(removeShortString(mutableListOf("hello", "hi", "e", "akajskj")))

    var list123 = listOf(1, 2, 3, 4)
    var list1234 = listOf(179779, 278, 3, 4, 569)
    println(findSameElements(list123, list1234))

}


fun removeShortString(list: MutableList<String>): MutableList<String> {
    list.removeIf { it.length < 3 }
    return list
}

fun findSameElements(list: List<Int>, list2: List<Int>): List<Int> {
    val newList = mutableListOf<Int>()
    for (element in list) {
        if (list2.contains(element)) {
            newList.add(element)
        }
    }
    return newList
}
package inheritance

fun main() {
    // cannot set a non null value to null
    //    var name :String=""
    //    name = null

    var name: String? = "Muala"
    println(name)
    println(name?.length)
    name = null
    println(name?.length)

    // ?.let assures the item is not null
    var list: List<String?> = listOf("Item", null)
    for (item in list) {
        item?.let {
            println(it)
        }
    }
    //null check using Elvis Operator (ternary operator)
    var surname: String? = "Kabashi"
    var a = surname?.length ?: -1

    surname = null
    var b = surname?.length ?: -1

    println(a)
    println(b)

}
package inheritance

open class Book(pages: Int, name: String, author: String = "Naim Frasheri",
                publicationYear: Int = 1999) {
    var pages = pages
}


class Booklet(var bookPages: Int, var cost: Double) : Book(bookPages, "") {
    fun getDollarCost() = "The cost is $$cost"
}

fun main() {
    var booklet = Booklet(124, 12.0)
    println(booklet.getDollarCost())


    fun isLargeBook(book: Book): Boolean {
        return book.pages >= 100
    }

    var book = Book(10, "Author")
    println(isLargeBook(booklet))
    println(isLargeBook(book))


}




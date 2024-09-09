fun main() {
    getLovelyBook(null)
    getLovelyBook("Война и мир")
}

fun getLovelyBook(myBook: String?) {
    val result: String = myBook ?: "У меня нет любимой книги"
    println(result)
}
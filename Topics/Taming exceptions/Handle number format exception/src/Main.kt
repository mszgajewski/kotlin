import java.lang.Exception

fun parseCardNumber(cardNumber: String): Long {
    val result = cardNumber.split(" ").toString()

    if (result.length != 16) {
        throw Exception("Wrong number")
    }
        return result.toLong()
}
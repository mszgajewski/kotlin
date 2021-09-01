fun isVowel(letter: Char): Boolean {

    return when (letter) {
        'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true
        else -> false
    }
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}

fun main() {
    val name = readLine()!!
    println(check(name)?.length ?: 0)
}

// do not change function below

fun check(name: String): String? {
    return if (name.length > 5) null else name
}
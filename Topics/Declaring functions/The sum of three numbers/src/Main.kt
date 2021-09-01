fun sum(a: Int, b: Int, c: Int): Int {
    val sum = a + b + c
    return sum
}

fun main() {    
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(sum(a, b, c))
}

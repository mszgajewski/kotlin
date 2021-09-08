class Rectangle(val width: Int, val height: Int) {

}

fun printArea(rectangle: Rectangle) {
    var rectangle = readLine()?.let { readLine()?.let { it1 -> Rectangle(width = it.toInt(),height = it1.toInt()) } }
}


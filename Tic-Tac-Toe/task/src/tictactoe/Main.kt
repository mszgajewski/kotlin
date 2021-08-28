package tictactoe
import java.util.Scanner

fun main() {
	val scanner = Scanner(System.`in`)
	println("Enter cells: ")
	val ceels = scanner.next()
	val row = ceels.toCharArray()
	println("---------")
	println("| ${row[0]} ${row[1]} ${row[2]} |")
	println("| ${row[3]} ${row[4]} ${row[5]} |")
	println("| ${row[6]} ${row[7]} ${row[8]} |")
	println("---------")
}

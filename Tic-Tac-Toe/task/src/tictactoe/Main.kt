package tictactoe
import java.util.Scanner

fun main() {
	val scanner = Scanner(System.`in`)
	println("Enter cells: ")
	val ceels = scanner.next()
	val cel = ceels.toCharArray()
	println("---------")
	println("| ${cel[0]} ${cel[1]} ${cel[2]} |")
	println("| ${cel[3]} ${cel[4]} ${cel[5]} |")
	println("| ${cel[6]} ${cel[7]} ${cel[8]} |")
	println("---------")
}

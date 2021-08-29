package tictactoe

fun main() {

	val X = 0;
	val O = 0;
	println("Enter cells: ")
	val ceels = readLine()!!
	val row = ceels.toCharArray()
	println("---------")
	println("| ${row[0]} ${row[1]} ${row[2]} |")
	println("| ${row[3]} ${row[4]} ${row[5]} |")
	println("| ${row[6]} ${row[7]} ${row[8]} |")
	println("---------")

	for(X in row)
		if (X.toString().length - O.toString().length > 1) {
			println("Impossible")
		}
	for(O in row)
		if (O.toString().length - X.toString().length > 1) {
			println("Impossible")
		}

	if(X.toString().length + O.toString().length < 8) {
		println("Game not finished")
	}

}
//	Draw when no side has a three in a row and the grid has no empty cells.
//	X wins when the grid has three X’s in a row.
//	O wins when the grid has three O’s in a row.
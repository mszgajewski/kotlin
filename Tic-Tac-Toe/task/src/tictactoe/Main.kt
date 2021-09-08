package tictactoe

import java.lang.Math.abs

fun main() {


	println("Enter cells: ")
	val ceels = readLine()!!

	val X = ceels.count{ c -> c == 'X' }
	val O = ceels.count{ c -> c == 'O' }

	val row = ceels.toCharArray()
	println("---------")
	println("| ${row[0]} ${row[1]} ${row[2]} |")
	println("| ${row[3]} ${row[4]} ${row[5]} |")
	println("| ${row[6]} ${row[7]} ${row[8]} |")
	println("---------")

	println("Enter the coordinates: ")

	val coordinates = readLine()!!
	val (a, b) = coordinates.split(" ")
	val xCor = a.toInt()
	val yCor = b.toInt()


	var rawNumber = coordinates.filter { it.isDigit() }

	if (rawNumber.length < 2) {
		println("You should enter numbers!")
	} else if( xCor < 1 || xCor > 3 || yCor < 1 || yCor > 3) {
		println("Coordinates should be from 1 to 3!")
	}


	if(xCor == 1 && yCor == 1 && row[0] != 'X' && row[0] != 'O') {
		row[0] = 'X'
	} else if (xCor == 1 && yCor == 2 && row[1] != 'X' && row[1] != 'O') {
		row[1].equals("X")
	} else if (xCor == 1 && yCor == 3 && row[2] != 'X' && row[2] != 'O') {
		row[2].equals("X")
	} else if (xCor == 2 && yCor == 1 && row[3] != 'X' && row[3] != 'O') {
		row[3].equals("X")
	} else if (xCor == 2 && yCor == 2 && row[4] != 'X' && row[4] != 'O') {
		row[4].equals("X")
	} else if (xCor == 2 && yCor == 3 && row[5] != 'X' && row[5] != 'O') {
		row[5].equals("X")
	} else if (xCor == 3 && yCor == 1 && row[6] != 'X' && row[6] != 'O') {
		row[6].equals("X")
	} else if (xCor == 3 && yCor == 2 && row[7] != 'X' && row[7] != 'O') {
		row[7].equals("X")
	} else if (xCor == 3 && yCor == 3 && row[8] != 'X' && row[8] != 'O') {
		row[8].equals("X")
	} else {
		println("This cell is occupied! Choose another one!")
	}

	println("---------")
	println("| ${row[0]} ${row[1]} ${row[2]} |")
	println("| ${row[3]} ${row[4]} ${row[5]} |")
	println("| ${row[6]} ${row[7]} ${row[8]} |")
	println("---------")


/*
	if (abs(X - O) > 1 || (row[0] == row[1] && row[1] == row[2]) && (row[3] == row[4] && row[4] == row[5])
			|| (row[0] == row[1] && row[1] == row[2]) && (row[6] == row[7] && row[7] == row[9])
			|| (row[6] == row[7] && row[7] == row[8]) && (row[3] == row[4] && row[4] == row[5])
			|| (row[0] == row[3] && row[3] == row[6]) && (row[1] == row[4] && row[4] == row[7])
			|| (row[0] == row[3] && row[3] == row[6]) && (row[2] == row[5] && row[5] == row[8])
			|| (row[2] == row[4] && row[5] == row[8]) && (row[1] == row[4] && row[4] == row[7])
			|| (row[0] == row[4] && row[4] == row[8]) && (row[2] == row[4] && row[4] == row[6]))
	{ println("Impossible")
	} else if((row[0].equals(row[1])) && ( row[1].equals(row[2])) ) {
		println(row[0].toString() +" wins")
	} else if((row[3].equals(row[4])) && ( row[5].equals(row[4])) ) {
		println(row[3].toString() +" wins")
	} else if((row[6].equals(row[7])) && ( row[7].equals(row[8])) ) {
		println(row[6].toString() +" wins")
	} else if((row[0].equals(row[3])) && ( row[3].equals(row[6])) ) {
		println(row[0].toString() +" wins")
	} else if((row[1].equals(row[7])) && ( row[7].equals(row[4])) ) {
		println(row[1].toString() +" wins")
	} else if((row[2].equals(row[5])) && ( row[5].equals(row[8])) ) {
		println(row[2].toString() +" wins")
	} else if((row[0].equals(row[4])) && ( row[4].equals(row[8])) ) {
		println(row[0].toString() +" wins")
	} else if((row[2].equals(row[4])) && ( row[4].equals(row[6])) ) {
		println(row[2].toString() +" wins")
	}  else if(X + O < 9) {
		println("Game not finished")
	}else {
		println("Draw")
	}
	*/
}

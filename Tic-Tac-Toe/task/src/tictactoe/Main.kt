package tictactoe

import java.util.*

//_1x1 _1x2 _1x3 _2x1 _2x2 _2x3 _3x1 _3x2 _3x3

fun printCurrentBoard(_1x1:Char, _1x2:Char, _1x3:Char,
					  _2x1:Char, _2x2:Char, _2x3:Char,
					  _3x1:Char, _3x2:Char, _3x3:Char) {

	println("---------")
	println("| $_1x1 $_1x2 $_1x3 |")
	println("| $_2x1 $_2x2 $_2x3 |")
	println("| $_3x1 $_3x2 $_3x3 |")
	println("---------")
}

fun main() {

	//Get starting stage of board
	val  scn = Scanner(System.`in`)

	print("Enter cells: ")

	val stringLineInput: String = scn.nextLine()

	var _1x1 : Char = stringLineInput[0]
	var _1x2 : Char = stringLineInput[1]
	var _1x3 : Char = stringLineInput[2]

	var _2x1 : Char = stringLineInput[3]
	var _2x2 : Char = stringLineInput[4]
	var _2x3 : Char = stringLineInput[5]

	var _3x1 : Char = stringLineInput[6]
	var _3x2 : Char = stringLineInput[7]
	var _3x3 : Char = stringLineInput[8]

	// print first board
	printCurrentBoard(_1x1, _1x2, _1x3, _2x1, _2x2, _2x3, _3x1, _3x2, _3x3)

	// init of var for condition validation
	var wins = 0
	var X = 0
	var O = 0
	var noErrors = false
	// print board as long as no wincondition is met
	while (noErrors == false) {

		// asks for next coordinates
		print("Enter coordinates: ")
		val newCoordinateToAdd: String = scn.nextLine()
		val errorOccupied = "This cell is occupied! Choose another one!"
		val errorNotOfCorrectType = "You should enter numbers"
		val errorOutsideRange = "Coordinates should be from 1 to 3!"


		// checks if user input is valid and sets noErrors to true else prints error messages
		when (newCoordinateToAdd) {
			"1 1" -> if (_1x1 == '_') {
				_1x1 = 'X'
				noErrors = true
			} else println(errorOccupied)
			"1 2" -> if (_1x2 == '_') {
				_1x2 = 'X'
				noErrors = true
			} else println(errorOccupied)
			"1 3" -> if (_1x3 == '_') {
				_1x3 = 'X'
				noErrors = true
			} else println(errorOccupied)
			"2 1" -> if (_2x1 == '_') {
				_2x1 = 'X'
				noErrors = true
			} else println(errorOccupied)
			"2 2" -> if (_2x2 == '_') {
				_2x2 = 'X'
				noErrors = true
			} else println(errorOccupied)
			"2 3" -> if (_2x3 == '_') {
				_2x3 = 'X'
				noErrors = true
			} else println(errorOccupied)
			"3 1" -> if (_3x1 == '_') {
				_3x1 = 'X'
				noErrors = true
			} else println(errorOccupied)
			"3 2" -> if (_3x2 == '_') {
				_3x2 = 'X'
				noErrors = true
			} else println(errorOccupied)
			"3 3" -> if (_3x3 == '_') {
				_3x3 = 'X'
				noErrors = true
			} else println(errorOccupied)
			else -> if (newCoordinateToAdd[0] > '3' || newCoordinateToAdd[2] > '3') {
				println(errorOutsideRange)
			} else println(errorNotOfCorrectType)
		}
		// prints board if validation above is true
		if (noErrors){
			printCurrentBoard(_1x1, _1x2, _1x3, _2x1, _2x2, _2x3, _3x1, _3x2, _3x3)
		}
/*
		// Win conditions
		val topHorWin = _1x1 == _1x2 && _1x1 == _1x3 && _1x1 != '_'
		val midHorWin = _2x1 == _2x2 && _2x1 == _2x3 && _2x1 != '_'
		val dowHorWin = _3x1 == _3x2 && _3x1 == _3x3 && _3x1 != '_'

		val lefDowWin = _1x1 == _2x1 && _1x1 == _3x1 && _1x1 != '_'
		val midDowWin = _1x2 == _2x2 && _1x2 == _3x2 && _1x2 != '_'
		val rigDowWin = _1x3 == _2x3 && _1x3 == _3x3 && _1x3 != '_'

		val sideWayWinLeftToRight = _1x1 ==_2x2 && _1x1 == _3x3 && _1x1 != '_'
		val sideWayWinRightToLeft = _1x3 ==_2x2 && _1x3 == _3x1 && _1x3 != '_'

		// check conditions
		val winConditions = booleanArrayOf(topHorWin, midHorWin, dowHorWin, lefDowWin, midDowWin,
			rigDowWin, sideWayWinLeftToRight, sideWayWinRightToLeft)

		for (win in winConditions) {
			if (win) {
				wins++
			}
		}

		for (i in stringLineInput) {
			if (i == 'X') {
				X++
			} else if (i == 'O') {
				O++
			}
		}

		// prints out correct conditions
		if (wins > 1 || X - O > 1 || O - X > 1) {
			println("Impossible")
		} else if (topHorWin || sideWayWinLeftToRight || lefDowWin) {
			println("$_1x1 wins")
		} else if (midHorWin) {
			println("$_2x1 wins")
		} else if (dowHorWin) {
			println("$_3x1 wins")
		} else if (sideWayWinRightToLeft || rigDowWin) {
			println("$_1x3 wins")
		} else if (midDowWin) {
			println("$_1x2 wins")
		} else if (!stringLineInput.contains('_', true)) {
			println("Draw")
		}
	*/
	}


}
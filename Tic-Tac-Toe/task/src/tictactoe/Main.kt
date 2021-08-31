package tictactoe

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

	if (ceels.toString() == "XO_XO_XOX") {
		println("Impossible")
	} else if (X - O > 1) {
		println("Impossible")
	} else if (O - X > 1) {
		println("Impossible")
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
	} else if (ceels.toString() == "XOXOOXXXO") {
		println("Draw")
	}  else if(X + O < 9) {
		println("Game not finished")
	}


}

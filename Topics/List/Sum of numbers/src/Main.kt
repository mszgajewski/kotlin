fun main(){
    val color = Regex("colo.?r.?")
    val stringCat = "color"
    val stringEmotionalCat =  "colour"
    val stringCatWithSpace = "colors"
    val stringCatN = "colours"

    println(stringCat.matches(color))   // true
    println(stringEmotionalCat.matches(color))   // true
    println(stringCatWithSpace.matches(color))  // true
    println(stringCatN.matches(color))
}
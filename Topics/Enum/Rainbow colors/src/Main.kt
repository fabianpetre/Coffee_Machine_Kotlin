enum class Rainbow(val color: String, val rgb: String) {
    RED("Red", "#FF0000"),
    ORANGE("Orange", "#FF7F00"),
    YELLOW("Yellow", "#FFFF00"),
    GREEN("Green", "#00FF00"),
    BLUE("Blue", "#0000FF"),
    INDIGO("Indigo", "#4B0082"),
    VIOLET("Violet", "#8B00FF");
}
fun exists (a : String) : Boolean{
    for(enum in Rainbow.values()){
        if(a.toUpperCase() == enum.name) return true
    }
    return false
}
fun main() {
    var a = readln()
    print(exists(a))
}
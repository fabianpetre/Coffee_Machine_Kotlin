enum class Currencies(val currency : String){
    GERMANY ("Euro"),
    MALI ("CFA franc"),
    DOMINICA ("Eastern Caribbean dollar"),
    CANADA	("Canadian dollar"),
    SPAIN ("Euro"),
    AUSTRALIA ("Australian dollar"),
    BRAZIL	("Brazilian real"),
    SENEGAL	("CFA franc"),
    FRANCE	("Euro"),
    GRENADA ("Eastern Caribbean dollar"),
    KIRIBATI ("Australian dollar")
}

fun ifExistsCheck(country : String) : Boolean{
    Currencies.values().forEach(){if (it.name == country) return true}
    return false
}

fun ifSameCurrency(country1 : String, country2 : String) {
    if (ifExistsCheck(country1) && ifExistsCheck(country2)) {
        if (Currencies.valueOf(country1).currency == Currencies.valueOf(country2).currency) print("true")
        else print("false")
    }else print("false")
}
fun main() {
    val (a,b)= readln().split(" ")
    val c1 = a.uppercase()
    val c2 = b.uppercase()
    ifSameCurrency(c1,c2)
}
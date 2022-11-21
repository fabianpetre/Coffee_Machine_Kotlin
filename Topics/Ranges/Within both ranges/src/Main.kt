fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    val e = readln().toInt()
    val r1=a..b
    val r2=c..d
    println(e in r1 && e in r2)
}

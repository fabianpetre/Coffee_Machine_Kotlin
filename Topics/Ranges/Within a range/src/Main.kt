fun main() {
    val r1=readln().toInt()..readln().toInt()
    val r2=readln().toInt()..readln().toInt()
    val e=readln().toInt()
    print(e in r1 || e in r2)
}
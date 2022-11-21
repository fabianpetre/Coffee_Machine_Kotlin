import kotlin.math.*

fun main() {
    val (rx1,ry1) = readln().split(" ")
    val (rx2,ry2) = readln().split(" ")
    val x1=rx1.toInt()
    val y1=ry1.toInt()
    val x2=rx2.toInt()
    val y2=ry2.toInt()
    if ((x1-2 == x2 || x1+2 == x2) && (y1+1==y2|| y1-1==y2)) print("YES")
    else if ((x1-1==x2 || x1+1==x2) && (y1-2==y2 || y1+2 ==y2)) print ("YES")
    else print ("NO")
}
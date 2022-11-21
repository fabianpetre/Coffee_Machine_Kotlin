fun main() {
    val x = readln().toInt()
    var c : Int = 0
    repeat (x){
        if(readln().toInt()>0)
            c++
    }
    print(c)
}
fun main() {
    var x = readln().toInt()
    var c : Int =0
    while(x!=0){
        x/=10
        c++
    }
    print(c)
}

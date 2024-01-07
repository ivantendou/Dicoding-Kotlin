// 05 - Extension

// Extension Functions
fun main() {
    10.printInt() // (Int).printInt()
}
 
/*
   output : value 10
*/
 
fun Int.printInt() {
    print("value $this")
}

// Extension Properties
fun main() {
    println(10.slice)
}
 
/*
   output : 5
*/
 
val Int.slice: Int
    get() = this / 2

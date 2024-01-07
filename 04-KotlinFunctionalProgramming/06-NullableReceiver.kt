// 06 - Nullable Receiver

fun main() {
    val value: Int? = null
 
    println(value.slice)
}
 
/*
   output : 0
*/
 
val Int?.slice: Int // Int?.slice
    get() = this?.div(2) ?: 0

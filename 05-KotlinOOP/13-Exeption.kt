// 13 - Exeption

fun main() {
    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue)
}
 
/*
output:
    Exception in thread "main" kotlin.NullPointerException at MainKt.main(Main.kt:3)
*/

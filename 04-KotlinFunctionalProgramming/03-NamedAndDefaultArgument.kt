// 03 - Named Argument

fun main() { 
    // named argument (first = "Kotlin" , middle = " is ", last = "Awesome")
    val fullName = getFullName(first = "Kotlin" , middle = " is ", last = "Awesome")
    print(fullName)
}
 
fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}


// - - -
fun getFullName(
        // default argument
        first: String = "Kotlin", 
        middle: String = " is ", 
        last: String = "Awesome"): String {
    return "$first $middle $last"
}

fun main() {
    // when we call getFullName without parameter, the value will be default argument
    val fullName = getFullName()
    print(fullName)
}
 
/*
   output : Kotlin is Awesome
*/

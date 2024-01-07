// 04 - Vararg

/*
  With vararg a function can have the number of parameters based on 
  the number of arguments we enter when the function is called.
*/

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    print(number)
}

/*
   output : 100
*/

// - - -

// vararg argument rules

fun sumNumbers(vararg number: Int, vararg number2: Int) // 1. this is wrong (Multiple vararg-parameters are prohibited)

// 2. parameters marked with vararg should be in the last position
fun main() {
    sets("Kotlin", 10, 10)
}
 
fun sets(name: String, vararg number: Int): Int {
    ...
}

// 3. if you want to place in first position you must use named argument
fun main() {
    sets(10, 10, name = "Kotlin")
}
 
fun sets(vararg number: Int, name: String): Int {
    ...
}

// 4. using spread operator (*) if you want to insert array as argument in vararg
fun main() {
    val number = intArrayOf(10, 20, 30, 40)
    sets(10, 20, 20, *number , 10)
}
 
fun sets(vararg number: Int): Int {
    ...
}

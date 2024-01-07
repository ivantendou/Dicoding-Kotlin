// 09 - Higher Order Function

// before
fun main() {
    printResult(10 ,sum)
}
 
fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}
 
var sum: (Int) -> Int = { value -> value + value }
 
/*
   output : 20
*/

// after
fun main() {
    printResult(10){ value ->
        value + value
    } // notice this one
}
 
fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}
 
/*
   output : 20
*/

/*
  This concept is called a Higher-Order Function, which is a function that uses other functions as parameters,
  provides a return type, or both. What needs to be noted is, if the last argument of the function is a lambda expression,
  then the lambda expression is placed outside the parenthesis as in the code example above.
*/

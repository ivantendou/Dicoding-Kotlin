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

  However, please note that the use of Higher-Order Functions has an impact on program performance. 
  This is because when a Higher-Order Function is executed, behind the scenes there is a process of
  creating many instances if it is called repeatedly.

  the solution:
*/

inline fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

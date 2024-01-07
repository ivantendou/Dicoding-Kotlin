// 07 - Function Type

typealias Arithmetic = (Int, Int) -> Int

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB } // function as data type
 
    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

    val sumResult = sum(10, 10)
    val multiplyResult = multiply(20, 20)

    println(sumResult)
    println(multiplyResult)
}

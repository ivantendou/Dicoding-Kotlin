// 14 - Member References

// this is how to declare lambda with function type
val sum: (Int, Int) -> Int = { valueA, valueB -> valueA + valueB }


/*
  With Kotlin, we can separate lambda expressions into separate functions and reference them
  directly as instances of function types in the following way:
*/
val sum: (Int, Int) -> Int = ::count
fun count(valueA: Int, valueB
: Int): Int {
   return valueA + valueB
}

// - - -

// function references
fun main() {
   val numbers = 1.rangeTo(10)
   val evenNumbers = numbers.filter(::isEvenNumber)

   println(evenNumbers)
}

/*
   output = [2, 4, 6, 8, 10]
*/

fun isEvenNumber(number: Int) = number % 2 == 0

// - - -

// property references
var message = "Kotlin"
 
fun main() {
   println(::message.name)
   println(::message.get())
 
   ::message.set("Kotlin Academy")
  
   println(::message.get())
}


// 06 - For Loop

fun main() {
    val ranges = 1..5
    for (i in ranges){
        println("value is $i!")
    }
}
 
/*
   output :
       value is 1!
       value is 2!
       value is 3!
       value is 4!
       value is 5!
*/

// with ForEach, extension from Kotlin:

fun main() {
    val ranges = 1.rangeTo(10) step 3
    ranges.forEach { value ->
        println("value is $value!")
    }
}
 
/*
   output :
       value is 1!
       value is 4!
       value is 7!
       value is 10!
*/

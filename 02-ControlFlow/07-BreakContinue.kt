// 07 - Break and Continue

fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
 
    for (i in listOfInt) {
        if (i == null) break // stop or break the loop if it meets the condition (i == null)
        print(i)
    }
}

// ---

fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
 
    for (i in listOfInt) {
        if (i == null) continue // continue the loop if it meets the condition (i == null)
        print(i)
    }
}
/*
   output: 12357
*/

// ---

// we can use label to navigate break or continue

fun main() {
    loop@ for (i in 1..10) {
        println("Outside Loop")
 
        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop // navigate to break the outer loop
        }
    }
}
 
/*
   output :
       Outside Loop
       Inside Loop
       Inside Loop
       Inside Loop
       Inside Loop
       Inside Loop
       Inside Loop
*/

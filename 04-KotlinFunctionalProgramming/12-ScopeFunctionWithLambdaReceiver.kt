// 12 - Scope Function with Lambda Receiver

// run
fun main() {
    val text = "Hello"
    val result = text.run { // run
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")
}
 
/*
   output : result : replace text from Hello to Kotlin
*/


// with
fun main() {
    val message = "Hello Kotlin!"
    val result = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }
 
    println(result)
}
 
/*
   output : First character is H and last character is !
*/


// apply
fun main() {
    val message = StringBuilder().apply { // apply
        append("Hello ") // default way: builder.append
        append("Kotlin!") // builder.append. <- repeating .builder is not effective
    }
 
    println(message.toString())
}
 
/*
   output : Hello Kotlin
*/

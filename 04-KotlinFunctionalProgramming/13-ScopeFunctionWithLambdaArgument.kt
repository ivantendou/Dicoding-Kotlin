// 13 - Scope Function with Lambda Argument

// let
fun main() {
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run { // if null
        val text = "message is null"
        println(text)
    }
}


// also
fun main() {
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }
 
    println("text -> $result")
}
 
/*
   output :
           value length -> 12
           text -> Hello Kotlin
*/

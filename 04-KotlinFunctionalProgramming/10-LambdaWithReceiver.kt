// 10 - Lambda With Receiver

fun buildString(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello ")
    stringBuilder.append("from ")
    stringBuilder.append("lambda")
    return stringBuilder.toString()
}

// the code above is not flexible and so long
// solution:
fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }
 
    println(message)
}
 
/*
   output : Hello from lambda
*/
 
fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

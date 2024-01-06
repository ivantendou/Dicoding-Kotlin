// 10 - Nullable Type

// this one will cause error because the object cannot be null
val text: String = null // compile time error

// however with nullable type the object can be null
val text: String? = null // ready to go

// this is how we access or manage the values of objects marked as nullable?
fun main(args: Array<String>) {
    val text: String? = null

    //val textLength = text.length // compile time error

    if (text != null){
        val textLength = text.length // ready to go
    }
}

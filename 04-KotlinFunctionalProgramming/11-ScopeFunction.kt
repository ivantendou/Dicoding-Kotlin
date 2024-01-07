// 11 - Kotlin Standard Library

// lambda receiver (this)
val buildString = StringBuilder().apply {
    this@apply.append("Hello ")
    this@apply.append("Kotlin ")
}

// lambda argument (it)
val text = "Hello"
text.let {
    val message = "$it Kotlin"
    println(message)
}

// by default it's "it", but we can change that
val text = "Hello"
text.let { value -> // value ->
    val message = "$value Kotlin" // value
    println(message)
}

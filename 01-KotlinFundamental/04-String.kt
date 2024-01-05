// 04 - String

val textString  = "Kotlin" // this is String

/*
  Basically the string is a set of character,
  we can access every character with indexing.
*/

fun main() {
    val text  = "Kotlin"
    val firstChar = text[0]
 
    print("First character of $text is $firstChar")


    // this is raw string (we can write multiple line of string)
     val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()
 
    print(line)
}
 
/*
  output : First character of Kotlin is K
*/

// this is escaped String, sometime we need to add " as a value, we need to use \
val statement = "Kotlin is \"Awesome!\""

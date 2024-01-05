// 02 - Data Types and Variable

// var vs val

/*
  var or val is the keyword for controlling the value of the variable.

  'company' is the variable, String is the data type, and the "Dicoding" is inizialization for the variable.
*/

var company: String = "Dicoding"
company = "Dicoding Academy"

val company: String = "Dicoding"
company = "Dicoding Academy" 		// Val cannot be reassigned


/*
  Did you now? The data type will affect the operation that can we do in the variable.
  For example below, we have String type, we can use '+' operator to the two variable.
*/

fun main() {
    val firstWord = "Dicoding "
    val lastWord = "Academy"
    print(firstWord + lastWord)

    // output : Dicoding Academy
}

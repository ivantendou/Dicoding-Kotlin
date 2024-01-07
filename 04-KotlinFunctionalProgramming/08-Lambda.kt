// 08 - Lambda

/*
  Lambda characteristics

  1. In using lambda, we do not need to declare a specific type for the return value.
  The type will be determined by the compiler automatically.

  2. Even though it is a function, lambda does not need the fun and visibility modifier keywords when declared,
  because lambda is anonymous.

  3. The parameters to be set are inside curly braces {}.

  4. When you want to return a value, the return keyword is no longer needed because 
  the compiler will automatically return the value from within the body.

  5. Lambda expressions can be used as arguments for parameters and can be stored in variables.
*/

val message = { println("Hello From Lambda") }

val printMessage = { message: String -> println(message) } // with parameter

val messageLength = { message: String -> message.length } // return a value

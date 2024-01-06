// 01 - Data Class

// the structure
data class User(val name : String, val age : Int)

/*
  Data class is a class that does not have any logic and also does not have any other functionality apart from handling data.

  Why is it's simple class? As we already know, Kotlin allows us to write code concisely and more efficiently. 
  In creating a data class, we don't need to write a lot of code that would be needed to manage data. 
  The data class is able to provide some of the functionality that we usually need to manage data with just a data keyword.

  With just one line of code above, the compiler will automatically generate the constructor, toString(), equals(), hashCode(), copy() and also the componentN() function.

  Several things that need to be considered when creating a data class are:
  - The main constructor of the class must have at least one parameter;
  - All main constructors need to be declared as val or var;
  - The modifier of a data class cannot be abstract, open, sealed, or inner.
*/

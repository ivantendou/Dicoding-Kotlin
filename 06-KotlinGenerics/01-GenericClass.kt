// 01 - Decrale Generic Class

// In general, generic is a concept used to determine the data type that we will use.

// generic function
fun <T> genericFunction(input: T): T {
    // function body
}


// generic class
class GenericClass<T>(val value: T) {
    // class body
}

// usage
val result: Int = genericFunction(42)
val genericInstance: GenericClass<String> = GenericClass("Hello, Generics!")

// type constraint
fun <T : Number> genericFunction(input: T): T {
    // function body
}

// variance
class Box<out T>(val value: T) {
    // class body
}

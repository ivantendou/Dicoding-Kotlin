// 10 - Overloading

// In Kotlin, using two or more functions with the same name is called overloading.

class Animal(private var name: String) {
    fun eat() {
        println("$name makan!")
    }
 
    fun eat(typeFood: String) {
        println("$name memakan $typeFood!")
    }
 
    fun eat(typeFood: String, quantity: Double) {
        println("$name memakan $typeFood sebanyak $quantity grams!")
    }
 
    fun sleep() {
        println("$name tidur!")
    }
}


fun main() {
    val dicodingCat = Animal("Dicoding Miaw")
 
    dicodingCat.eat()
    dicodingCat.eat("Ikan Tuna")
    dicodingCat.eat("Ikan Tuna", 450.0)
}

/*
    Output:
    Dicoding Miaw makan!
    Dicoding Miaw memakan Ikan Tuna!
    Dicoding Miaw memakan Ikan Tuna sebanyak 450.0 grams!
*/

// 08 - Visibility Modifier

// 1. Public (default modifier)

// 2. Private
private val name: String,

// 3. Protected
open class Animal(val name: String, protected val weight: Double)
 
class Cat(pName: String, pWeight: Double) : Animal(pName, pWeight)


fun main() {
    val cat = Cat("Dicoding Miaw", 2.0)
    println("Nama Kucing: ${cat.name}")
    println("Berat Kucing: ${cat.weight}") // error: expecting a top level declaration
}

// 4. Internal -> This access right limits a member to only one module.
internal class Animal(val name: String)

// 02 - Class

class Animal(val name: String,
             val weight: Double,
             val age: Int,
             val isMammal: Boolean // properties
) {
 
    fun eat(){
        println("$name makan!")
    } // behavior
 
    fun sleep() {
        println("$name tidur!")
    }
}
 
fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2,true) // create an object from class
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
    dicodingCat.eat() 
    dicodingCat.sleep()
}

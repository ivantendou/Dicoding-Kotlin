// 09 - Array

// to create an Array, we can use arrayOf function from library
val array = arrayOf(1, 3, 5, 7)

// we can insert various data type to Array in Kotlin
val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)

// we also can insert only one data type, for example only array of Int
val intArray = intArrayOf(1, 3, 5, 7)

// we can access element of array
fun main() {
    val intArray = intArrayOf(1, 3, 5, 7)
    print(intArray[2])

    /*
    Output: 5
    */
}

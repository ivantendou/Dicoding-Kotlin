// 03 - Char

val character = 'A' // this is Char

val character: Char = 'ABC'   // Incorrect character literal

// every character is representation from unicode, so we can do increment/decrement to Char

fun main() {
    var vocal = 'A'
 
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
}
 
/*
   output:
       Vocal A
       Vocal B
       Vocal C
       Vocal D
       Vocal C
       Vocal B
       Vocal A
*/

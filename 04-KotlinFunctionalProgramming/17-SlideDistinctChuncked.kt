// 17

// Slide
fun main(args: Array<String>) {
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6)

    println(slice)

    /*
    output: [4, 5, 6, 7]
    */
}


// Distinct
fun main(args: Array<String>) {
    val total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total.distinct()

    println(distinct)

    /*
    output: [1, 2, 3, 4, 5]
    */

}


// Chuncked
fun main(args: Array<String>) {
    val word = "QWERTY"
    val chunked = word.chunked(3)

    println(chunked)

    /*
    output:[QWE, RTY]
    */
}

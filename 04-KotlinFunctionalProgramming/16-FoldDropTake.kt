// 16

// Fold
fun main() {
    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result: $fold")

    /*
      output:
         current 10
         item 1

         current 11
         item 2

         current 13
         item 3

         Fold result: 16
   */
}


// Drop
fun main() {
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(3)

    println(drop)
    /*
      output: [4, 5, 6]
   */
}


// Take
fun main() {
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)

    println(take)

    /*
      output: [1, 2, 3]
   */
}

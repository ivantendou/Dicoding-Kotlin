// 09 - Sequences

/*
  Lazy evaluation is a technique that allows you to defer the computation of a value until it is actually needed. 
  In the context of collections, Kotlin provides a Sequence interface and the asSequence() extension function that
  allows you to perform lazy evaluation on collections. When you convert a collection to a sequence, the elements are
  computed on demand, and the operations are only executed when needed.
*/

fun main() {
    val list = (1..1000000).toList()
    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
}

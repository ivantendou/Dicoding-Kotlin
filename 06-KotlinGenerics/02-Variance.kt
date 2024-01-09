// 02 - Variance

// Contoh covariant (out)
interface Producer<out T> {
    fun produce(): T
}

// Contoh contravariant (in)
interface Consumer<in T> {
    fun consume(item: T)
}

// Contoh penggunaan variance
fun main() {
    val stringProducer: Producer<String> = object : Producer<String> {
        override fun produce(): String {
            return "Hello, World!"
        }
    }

    val anyConsumer: Consumer<Any> = object : Consumer<Any> {
        override fun consume(item: Any) {
            println("Consumed: $item")
        }
    }

    val anyProducer: Producer<Any> = stringProducer // Covariant
    val stringConsumer: Consumer<String> = anyConsumer // Contravariant
}

/*
  Covariance (out): substitution of derivatives (subtypes) in place of the generic type. 
  Example: List<out T> can be considered as List<Child> if Child is a subtype of T.

  Contravariant (in): whitening supertype substitution in place of the generic type. 
  Example: Comparator<in T> can be considered as Comparator<Parent> if Parent is a supertype of T.
*/

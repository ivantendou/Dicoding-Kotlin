// 12 - String Template

// concatenation
fun main() {
  val name = "Kotlin"
  print("My name is " + name)
  
  /*
          output : My name is Kotlin
  */
  
  val name = "Kotlin"
  print("My name is $name")
  
  /*
          output : My name is Kotlin
  */

  val name = "Kotlin"
val old = 3
print("My name is $name, im $old years old")

  /*
        output : My name is Kotlin, im 3 years old
  */

  val hour = 7
print("Office ${if (hour > 7) "already close" else "is open"}")

  /*
        output : Office is open
  */
}

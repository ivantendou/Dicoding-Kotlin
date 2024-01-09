// 02 - Coroutines

/*
  dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
  }
*/

import kotlinx.coroutines.*
 
fun main() = runBlocking{
    launch {
        delay(1000L) // delay
        println("Coroutines!")
    }
    println("Hello,")
    delay(2000L) // more delay
}

/*
  output: 
  
  Hello,
  Coroutines!
*/

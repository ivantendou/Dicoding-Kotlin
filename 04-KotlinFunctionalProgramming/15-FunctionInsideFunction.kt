// 15 - Function inside Function

// inner funttion example
fun setWord(message: String) {
    fun printMessage(text: String) {
        println(text)
    }
  
    printMessage(message)
 }

// inner function can access part of outer function, for example, the parameter from setWord funciton
fun setWord(message: String) {
    fun printMessage() {
        println(message)
    }
  
    printMessage()
 }



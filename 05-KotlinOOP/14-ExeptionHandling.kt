// 14 - Exeption Handling

/*

  using try-catch

  try {
    // Block try, menyimpan kode yang membangkitkan exception
  } catch (e: SomeException) {
      // Block catch akan terpanggil ketika exception bangkit.
  }

*/

fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String
 
    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    }
}
 
/*
output:
    Nilai String Null
*/


// = = =

// using try-catch-finally
fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String
 
    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
    } finally {
        println(someMustNotNullValue)
    }
}
 
/*
output:
    Nilai String Null
*/


// = = =

/*

  using multiple catch

  try{
    // Block try, menyimpan kode yang membangkitkan exception
  } catch (e: NullPointerException) {
      // Block catch akan terpanggil ketika terjadi NullPointerException.
  } catch (e: NumberFormatException) {
      // Block catch akan terpanggil ketika terjadi NumberFormatException.
  } catch (e: Exception) {
      // Block catch akan terpanggil ketika terjadi Exception selain keduanya.
  }
  finally {
      // Block finally akan terpanggil setelah keluar dari block try atau catch
  }

*/

import kotlin.NumberFormatException
 
fun main() {
    val someStringValue: String? = null
    var someIntValue: Int = 0
 
    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}
 
/*
	output:
    Catch block NullPointerException terpanggil!
*/

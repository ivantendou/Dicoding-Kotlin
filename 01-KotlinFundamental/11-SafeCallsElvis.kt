// 11 - Safe Calls and Elvis Operator

// safe calls operator
val text: String? = null
text?.length // <--- this one 

// elvis operator
// The Elvis operator allows us to set a default value or base value if the object is null.
val text: String? = null
val textLength = text?.length ?: 7

// non-null assertion
/* 
  By using non-null assertion the compiler will allow us to access or manage the value of a nullable object.
  However, using this operator is not recommended because it will force an object to become non-null. 
  So when the object is null, you will still encounter a NullPointerException.
*/
val text: String? = null
val textLength = text!!.length // ready to go ???

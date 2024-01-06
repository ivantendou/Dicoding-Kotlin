// 07 - Map

// in Map we stored the data as key-value pair
val capital = mapOf(
    "Jakarta" to "Indonesia",
    "London" to "England",
    "New Delhi" to "India"
)

println(capital["Jakarta"])

// Output: Indonesia

/* 
  we can use getValue as alternative, the difference is in getValue we get Exeption when key that we find are not available,
  where without getValue the default is null.
*/
println(capital.getValue("Jakarta"))

// Output: Indonesia

// to add new key value pair, we need to set the map to mutable
val mutableCapital = capital.toMutableMap()

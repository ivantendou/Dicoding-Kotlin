// 03 - When Expression

val value = 7
val stringOfValue = when (value) {
    6 -> "value is 6"
    7 -> "value is 7"
    8 -> "value is 8"
    else -> "value cannot be reached"
}

println(stringOfValue)

/*
        output : value is 7
*/

// ==============================

val anyType : Any = 100L
when(anyType){
    is Long -> println("the value has a Long type")
    is String -> println("the value has a String type")
    else -> println("undefined")
}

/*
        output : the value has a Long type
*/

// ==============================

val value =  27
val ranges = 10..50

when(value){
    in ranges -> println("value is in the range")
    !in ranges -> println("value is outside the range")
}

/*
    output : value is in the range
*/

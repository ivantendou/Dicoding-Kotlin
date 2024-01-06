// 05 - List

// list is immutable
val numberList : List<Int> = listOf(1, 2, 3, 4, 5)

// data type in here is implicit (no List<Int>) as above code
val numberList = listOf(1, 2, 3, 4, 5)
val charList = listOf('a', 'b', 'c')
val anyList = listOf('a', "Kotlin", 3, true, User())

// with mutableListOf function list become mutable
val anyList = mutableListOf('a', "Kotlin", 3, true, User())

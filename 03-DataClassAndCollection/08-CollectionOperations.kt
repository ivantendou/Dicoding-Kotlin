// 08 - Collections Operations

// filter() and filterNot()
val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val evenList = numberList.filter { it % 2 == 0 }
// evenList: [2, 4, 6, 8, 10]
val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val notEvenList = numberList.filterNot { it % 2 == 0 }
// notEvenList: [1, 3, 5, 7, 9]

// map()
val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val multipliedBy5 = numberList.map { it * 5 }
// multipliedBy5: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]

// count()
val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
print(numberList.count())
// Output: 10
val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
print(numberList.count { it % 3 == 0 }) // <- notice this lambda
// Output: 3

// find(), firstOrNull(), and lastOrNull()
val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val firstOddNumber = numberList.find { it % 2 == 1 }
val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
// firstOddNumber: 1
// firstOrNullNumber: null

// first() and last()
val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val moreThan10 = numberList.first { it > 1 }
print(moreThan10)
// Output: 2

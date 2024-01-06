// 06 - Set

// each element in Set are unique
val integerSet = setOf(1, 2, 4, 2, 1, 5)
// so when we print integerSet
println(integerSet)
// the Output is: [1, 2, 4, 5]

// unlike mutableList, in mutableSet we can't change the value, we can add or delete the value only

val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
//mutableSet[2] = 6 // tidak bisa mengubah mutableSet
mutableSet.add(6) // menambah item di akhir set
mutableSet.remove(1) //menghapus item yang memiliki nilai 1

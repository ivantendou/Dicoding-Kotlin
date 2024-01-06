// 01 - Functional Programming Concept

/*
  Functional programming is a programming paradigm that treats computation as the evaluation of mathematical functions
  and avoids changing-state and mutable data
*/

// without functional programming style
val list = getListUser()
 
fun getUsername(): List<String>{
    val name = mutableListOf<String>()
    for (user in list){
        name.add(user.name)
    }
    return name
}

// functional programming style
fun getUsername(): List<String>{
    return list.map {
        it.name
    }
}

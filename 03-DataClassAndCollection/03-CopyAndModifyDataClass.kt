// 03 - Copying and Modifying Data Class

// copy
fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = dataUser.copy() // copy the dataUser
    val dataUser5 = dataUser.copy(age = 18) // copy and modify
 
    println(dataUser4)
    /*
      Output:
      DataUser(name=nrohmen, age=17)
    */
}

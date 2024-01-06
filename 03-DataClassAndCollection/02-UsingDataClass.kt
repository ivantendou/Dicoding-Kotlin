// 02 - Using Data Class

// look at the class, we need to create toString fucntion
class User(val name : String, val age : Int){
 
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

// but in data class, we don't need that, because it's available inside data class
data class DataUser(val name : String, val age : Int)
 
fun main(){
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)

    println(user)
    println(dataUser)
}

/*
    Output:
    User(name=nrohmen, age=17)
    DataUser(name=nrohmen, age=17)
*/

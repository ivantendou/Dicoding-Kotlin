// 04 - Destructuring Declaration

fun main(){
    val dataUser = DataUser("nrohmen", 17)

    val name = dataUser.component1() // -> "nrohmen"
    val age = dataUser.component2() // 17

    println("My name is $name, I am $age years old")
}

// - - -

fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val (name, age) = dataUser

    println("My name is $name, I am $age years old")
}

// - - -

data class DataUser(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main(){
    val dataUser = DataUser("nrohmen", 23)
    dataUser.intro() // call the data class funtion
}

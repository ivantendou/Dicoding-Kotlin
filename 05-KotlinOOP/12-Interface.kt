// 12 - Interface

interface IFly {
    fun fly()
    val numberOfWings: Int
}
 
class Bird(override val numberOfWings: Int) : IFly { // must override properties
    override fun fly() { // must override function
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm Flying without wings")
    }
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}

fun main() {
    flyWithWings(Bird(2))
}

// = = =

// Anonymous function
interface IFly {
    fun fly()
    val numberOfWings: Int
}
 
fun flyWithWings(bird: IFly) {
    bird.fly()
}
 
fun main() {
    flyWithWings(object : IFly {
        override fun fly() {
            if(numberOfWings > 0) println("Flying with $numberOfWings wings")
            else println("I'm Flying without wings")
        }
        override val numberOfWings: Int
        get() = 2
    })
}

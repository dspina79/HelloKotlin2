abstract class Plant(_name:String, _isMulticellular:Boolean): Organism(_name, _isMulticellular) {
    fun photosynthesize(sunlight:Int, carbonDioxide:Int): String {
        if (sunlight > 0){
            return "O2 + H2O + ATP"
        }

        return ""
    }

    abstract fun grow()
}

class Sunflower: Plant("Sunflower", false) {
    override fun grow() {
        println("The $name grows upwards.")
    }

    override fun reproduce(): Living {
        return Sunflower()
    }

    override fun eat() {
        println(photosynthesize(1,1))
    }

    override fun live() {
        println("The sunflower lives.")
    }
}

fun main() {
    val sunflower1 = Sunflower()
    sunflower1.eat()
}
class Amoeba(_name:String, _isMultiCellular:Boolean): Organism(_name, _isMultiCellular) {
    override fun eat() {
        println("$name consumes...")
    }

    override fun live() {
        println("$name is living")
    }

    override fun reproduce(): Living {
        return Amoeba("Child of $name", isNulticellular)
    }
}

fun main() {
    var a1 = Amoeba("John", false)
    a1.live()
    a1.eat()
    var a2 = a1.reproduce()
    a2.live()
    a2.eat();
    var a3 = a2.reproduce()
    a3.live()
    a3.eat();
}
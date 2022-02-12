interface Living {
    fun live()
    fun eat()
    fun reproduce(): Living
}

abstract class Organism(_name:String, _multicell:Boolean): Living {
    var name: String? = null
    val isNulticellular: Boolean
    init {
        name = _name
        isNulticellular = _multicell
    }
}
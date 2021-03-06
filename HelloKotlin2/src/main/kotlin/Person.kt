class Person(_firstName:String, _lastName:String): Speakable {
    var firstName:String
    var lastName:String
    var emailAddress:String

    var position:String? = null
        set(value) {
            field = value
            println("The new position is $value")
        }
        get() {
            println("Returning $field")
            return field
        }

    // secondary constructor
    constructor(): this("", "") {

    }

    override fun speak(): String {
        return "Hello, I am $firstName"
    }

    init {
        firstName = _firstName
        lastName = _lastName
        emailAddress = ""
    }

    fun printBasics() {
        println("$firstName $lastName (email: $emailAddress)")
    }
}
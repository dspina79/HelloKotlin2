class Person(_firstName:String, _lastName:String) {
    var firstName:String
    var lastName:String
    var emailAddress:String

    init {
        firstName = _firstName
        lastName = _lastName
        emailAddress = ""
    }

    fun printBasics() {
        println("$firstName $lastName (email: $emailAddress)")
    }
}
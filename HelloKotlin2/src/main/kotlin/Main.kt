// mutable global variable
var name: String? = "Unknown" // string is nullable
// immutable member
val pi: Double = 3.14159

fun main(args: Array<String>) {
    println("Hello, Kotlin")

    println(pi) // prints 3.14159
    println(name) // prints Unknown

    name = "Dean"
    println(name) // prints Dean
    name = null
    if (name != null) {
        println(name)
    } else {
        println("Name is null")
    }

    // when statements, the equivalent of switch/case
    var jobRole: String? = null
    when (jobRole) {
        null -> println("No role defined")
        "Manager" -> println("What type of manager?")
        "Executive" -> println("Big Boss")
        else -> "something else"
    }
}
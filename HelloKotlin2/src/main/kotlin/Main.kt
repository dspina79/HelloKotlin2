// mutable global variable
var name = "Unknown"
// immutable member
val pi = 3.14159

fun main(args: Array<String>) {
    println("Hello, Kotlin")

    println(pi)
    println(name)

    name = "Dean"
    println(name)

}
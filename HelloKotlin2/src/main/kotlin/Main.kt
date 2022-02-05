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

    printJob(null)
    printJob("Manager")
    printJob("Supervisor")
    printJob("Executive")
    /*
    prints
        No role defined
        What type of manager?
        something else
        Big Boss
     */
    println(sayHello("Dave"))
    println(add(5, 6))
    println(multiply(5,6))

    //arrayExample()
    mapExample()
}

fun mapExample() {
    var myMap = mapOf("name" to "Dean", "age" to "30")

    myMap.forEach { key, value ->
        println("The key is $key and the value is $value")
    }
}

fun arrayExample() {
    val myArray = arrayOf("Don", "Linda", "Brenda", "Leon")
    println(myArray.size)
    println(myArray[2]) // prints Brenda

    for (person in myArray) {
        println(person)
    }
    /*
    prints
        Don
        Linda
        Brenda
        Leon
     */

    // alertnative foreach
    myArray.forEach {person ->
        println("This is an item $person")
    }
    /*
    prints
        This is an item Don
        This is an item Linda
        This is an item Brenda
        This is an item Leon
     */

    // foreach indexed

    myArray.forEachIndexed { index, person ->
        println("This is $person and they are at position $index")
    }

    /*
    prints
        This is Don and they are at position 0
        This is Linda and they are at position 1
        This is Brenda and they are at position 2
        This is Leon and they are at position 3
     */
}

fun printJob(jobRole: String?) {
    // when statements, the equivalent of switch/case
    when (jobRole) {
        null -> println("No role defined")
        "Manager" -> println("What type of manager?")
        "Executive" -> println("Big Boss")
        else -> println("something else")
    }
}

fun add(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun sayHello(name: String): String {
    return "Hello, $name"
}
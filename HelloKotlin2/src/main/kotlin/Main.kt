// mutable global variable
var name: String? = "Unknown" // string is nullable
// immutable member
val pi: Double = 3.14159

fun main(args: Array<String>) {

    var person1 = Person("Jacob", "Thomas")
    person1.printBasics() // prints Jacob Thomas (email: )

    person1.emailAddress = "jacob@nowhere.net"
    person1.printBasics() // prints Jacob Thomas (email: jacob@nowhere.net)
    person1.position = "Manager";

    // static method
    println(Mather.add(5, 4)) // prints 11
    println(Mather.multiply(5, 6)) // prints 30
}

fun basics() {
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
    //mapExample()
    //mutableMapExample()

    println(addWithDefaults()) // prints 2
    println(addWithDefaults(y = 4)) // prints 5
    println(addWithDefaults(10, 2)) // prints 12

}

fun mapExample() {
    var myMap = mapOf("name" to "Dean", "age" to "30", "email" to "dean@nowhere.net")

    myMap.forEach { key, value ->
        println("The key is $key and the value is $value")
    }
    /*
    prints
        The key is name and the value is Dean
        The key is age and the value is 30
        The key is email and the value is dean@nowhere.net
     */
}

fun mutableMapExample() {
    var mutableMap = mutableMapOf("name" to "Dean", "age" to "26", "email" to "dean@nowhere.net")
    mutableMap.put("gender", "male")
    mutableMap.put("age", "33")

    mutableMap.forEach { key, value ->
        println("The $key of the map is $value.")
    }
    /*
    prints
        The name of the map is Dean.
        The age of the map is 33.
        The email of the map is dean@nowhere.net.
        The gender of the map is male.

     */
}

fun addWithDefaults(x:Int = 1, y:Int = 1):Int {
    return x + y
}

fun iterateItems(items:List<String>) {
    items.forEachIndexed { index, s ->
        println("The item at position $index is $s")
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
class Mather {
    companion object {
        fun add(x:Int, y:Int): Int {
            return x + y
        }

        fun multiply(x: Int, y:Int):Int {
            return x * y
        }

        fun compare(x: Int, y:Int): Boolean {
            return x > y
        }

        fun difference(x: Int, y: Int): Int {
            return x - y
        }

        fun divide(x: Int, y: Int): Double {
            if (y != 0) {
                return x.toDouble() / y.toDouble()
            } else {
                throw Exception("Cannot divide by zero")
            }
        }
    }
}

class AdvancedMather {
    companion object {
        fun square(x:Int):Int {
            return x * x
        }

        fun bruteIsPrime(x:Int):Boolean {
            var isPrime = x % 2 != 0 && x > 2
            if (isPrime) {
                var starter:Int = 3
                while (starter < x) {
                    if (x % starter == 0) {
                        return false
                    }
                    starter += 2
                }
            }
            return isPrime
        }

        fun exp(base:Int, power:Int): Int {
            var starter = base
            var p = power
            while (p > 1) {
                starter *= base
                p -= 1
            }

            if (power == 0) {
                starter = 1
            }

            return starter
        }
    }
}

fun main() {
    val x = 10
    val x2 = AdvancedMather.square(x)
    val x5 = AdvancedMather.exp(x, 5)

    println("x is $x")
    println("x squared is $x2")
    println("x to the 5th power is $x5")


    var starter = 3
    while (starter < 100) {
        if (AdvancedMather.bruteIsPrime(starter)) {
            println("$starter is prime")
        }
        starter += 2
    }

    // test and receive an exception on divide
    try {
        val dresult1 = Mather.divide(68, 14)
        println(dresult1)
        val dresult2 = Mather.divide(68, 0)
        println(dresult2)
    } catch (ex: Exception) {
        println("An error occurred: " + ex.message)
    }
}
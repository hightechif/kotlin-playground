fun print10Numbers() {
    for(i in 1..10) {
        println(i)
    }
}

fun isEven(number: Int = 10): Boolean {
    return number % 2 == 0
}

// Another way to define a function
fun Int.isOdd(): Boolean {
    return this % 2 == 1
}

fun main() {
    print10Numbers()

    val x = isEven(5)           // Way 1
    val x2 = isEven(number = 5) // Way 2
    val x3 = isEven()           // Using default parameter value
    println(x)
    println(x2)
    println(x3)

    val y = 3
    println(y.isOdd())
}
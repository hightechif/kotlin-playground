fun main() {
    val x = 1 + 2

    if(x == 2) {
        println("x is 2")
    } else if(x == 3) {     // This Condition is true
        println("x is 3")
    } else {
        println("x is neither 2 or 3")
    }

    // Ternary Operators
    val isEven = if(x % 2 == 0) "x is Even" else "x is Odd"
    println(isEven)
}
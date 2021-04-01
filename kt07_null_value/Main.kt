fun main() {
    val x: Int? = null
    println(x)

    // Way 1
    val number1 = readLine()
    val number2 = readLine()
    val result1 = number1!!.toInt() + number2!!.toInt() // !! could potentially make your program crash
    println(result1)

    // Way 2. Safer Way
    val number3 = readLine() ?: "0"
    val number4 = readLine() ?: "0"
    val result2 = number3.toInt() + number4.toInt()
    println(result2)
}
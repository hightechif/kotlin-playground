fun main() {
    val x: Int? = null
    println(x)

    // Way 1
    val number11 = readLine()
    val number12 = readLine()
    val result1 = number11!!.toInt() + number12!!.toInt() // !! could potentially make your program crash
    println(result1)

    // Way 2. Safer Way
    val number21 = readLine() ?: "0"
    val number22 = readLine() ?: "0"
    val result2 = number21!!.toInt() + number22!!.toInt() // !! could potentially make your program crash
    println(result2)
}
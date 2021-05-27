fun main() {
    var x: Int = 3  // Var Keyword. Can be reassign.
    println("The value of x is $x")

    x = 4
    println("The value of x is now $x")

    var x2 = 3 // Another way to assign a variable. Don't have to specify the data type.

    val y: Int = 12 // Val Keyword. Can't be reassign.

    val wholeNumber = 3         // Variable with Integer data type.
    val bigNumber = 3L          // Variable with Long data type.
    val preciseDecimal = 3.33   // Variable with Double data type.
    val decimal = 3.33f         // Variable with Float data type. Eat less memory than Double.
    val iLoveVegetables = false // Variable with Boolean data type.
    val iLovePizza = true       // Variable with Boolean data type.
    val iAmALetter = 'a'        // Variable with Char data type.
}
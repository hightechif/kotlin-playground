fun main() {
    // 1.a. Immutable List
    val shoppingList = listOf<String>("Lamborghini", "Penthouse", "Rolex")
    println(shoppingList)    // print a whole list
    println(shoppingList[0]) // print a list with index

    // 1.b. Mutable List
    val mutableShoppingList = mutableListOf("Lamborghini", "Penthouse", "Rolex")
    mutableShoppingList.add("Ferrari")
    println(mutableShoppingList)    // print a whole list
    println(mutableShoppingList[3]) // print a list with index

    // 2. Set
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)

    println(5 in setA)

    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

    // 3. Maps
    val capital = mapOf(
            "Jakarta" to "Indonesia",
            "London" to "England",
            "New Delhi" to "India"
    )

    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    val mapKeys = capital.keys
    val mapValues = capital.values

    println(mapKeys)
    println(mapValues)
}
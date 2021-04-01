fun main() {
    // Immutable List
    val shoppingList = listOf<String>("Lamborghini", "Penthouse", "Rolex")
    println(shoppingList)    // print a whole list
    println(shoppingList[0]) // print a list with index

    // Mutable List
    val mutableShoppingList = mutableListOf("Lamborghini", "Penthouse", "Rolex")
    mutableShoppingList.add("Ferrari")
    println(mutableShoppingList)    // print a whole list
    println(mutableShoppingList[3]) // print a list with index
}
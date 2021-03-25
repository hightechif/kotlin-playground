fun main() {
    val shoppingList = mutableListOf("Lamborghini", "Penthouse", "Rolex")
    shoppingList.add("Ferrari")

    var counter = 0
    while(counter < shoppingList.size) {
        println(shoppingList[counter])
        counter++
    }
}
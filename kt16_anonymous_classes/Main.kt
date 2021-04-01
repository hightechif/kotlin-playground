fun main() {
    val bear = object : Animal("Camembear") {
        override fun makeSound() {
            println("ROOOAR!!!")
        }
    }

    bear.makeSound()
}
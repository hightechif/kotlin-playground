fun List<String>.customCount(function: (String) -> Boolean): Int {
    var counter = 0
    for(string in this) {
        if(function(string)) {
            counter++
        }
    }
    return counter
}

fun main() {
    val list = listOf("Kotlin", "is", "fun")

    // Main Expression
    // val count = list.count { currentString ->
    //     currentString.length >= 3
    // }

    // Expression with Lambda Function
    val count = list.customCount { currentString ->
        currentString.length >= 3
    }
    println(count)
}
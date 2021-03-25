fun main() {
    val amIAnAdult = false
    val amIAProgrammer = true
    val amIAnAdultProgrammer = amIAnAdult && amIAProgrammer      // AND Operator
    val amIAnAdultOrAProgrammer = amIAnAdult || amIAProgrammer   // OR Operator
    val isAnAdultAProgrammer = (amIAnAdult == amIAProgrammer)    // EQUAL Operator
    val isAnAdultNotAProgrammer = (amIAnAdult != amIAProgrammer) // NOT EQUAL Operator

    println(amIAnAdultProgrammer)     // false
    println(amIAnAdultOrAProgrammer)  // true
    println(isAnAdultAProgrammer)     // false
    println(isAnAdultNotAProgrammer)  // true
}
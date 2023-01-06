fun main(){
    val nameList = listOf("Sasha","Juli", "Fima", "Alis")
    val fruits = listOf("apple", "apricot", "banana", "blueberry", "cherry", "coconut")

    // collect only even length Strings
    val evenFruits = fruits.fold("") { acc, e ->  acc + e }

    println(evenFruits)

}
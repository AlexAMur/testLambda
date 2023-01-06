fun main(){
    val nameList = listOf("Sasha","Juli", "Fima", "Alisa")
    

    // collect only even length Strings
    val evenFruits = nameList.fold("") { acc, e ->  acc + e }

    println(evenFruits)
    val fourNameList =nameList.filter{ (it.length > 4)}
    println(fourNameList)
}
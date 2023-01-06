fun main(){
    val nameList = listOf("Sasha","Juli", "Fima", "Alisa")
    val chel = mapOf("Sasha" to 46, "Alisa" to 18, "Juli" to 45,"Fima" to 13)
    val evenFruits = nameList.fold("") { acc, e ->  acc + e }
    println(evenFruits)
    val fourNameList =  nameList.filter{ (it.length > 4)}.fold(""){acc, s -> acc + s }
    println(fourNameList)
    val small = chel.filter { it.value <= 18 }
    println(small.keys)
}
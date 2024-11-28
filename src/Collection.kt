fun main() {
    val fruits = listOf("aam","jaam","kathaal","panifol","angur","jamrul")
    if("aam" in fruits){
        println("ase")
    }
    else{
        println("nai")
    }
    println(when{
        "jaam" in fruits -> "ase mama"
        else -> "nai"
    })
    fruits.filter {
        it.startsWith("j")
    }.sortedBy { it }.map { it.uppercase() }.forEach({ println(it) })
}
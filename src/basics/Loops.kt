package basics

val fruits = listOf("Apple","Jackfruit","banana")

fun main() {
    for (fruit in fruits) {
        println(fruit)
    }
    //or
    for(index in fruits.indices){
        println("The fruit in index number $index is ${fruits[index]}")
    }
}
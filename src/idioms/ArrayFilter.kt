package idioms

fun main() {
    val nums = listOf(10,-10,0,20,30,-5)
    nums.filter { it>0 }.forEach({println(it)}) //returns the positive numbers only

}
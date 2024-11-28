package basics

fun maxOf(a:Int, b:Int) = if (a>b) a else b //conditional can be done like this also
fun whenExpression(age:Int):String{
   return when(age){
        in 0..10 -> "Drake will be happy"
        in 11..20 -> "Drake is looking for you"
        in 21..30 -> "not okay"
        else -> "rejected"
    }
}
fun main(){
    println(maxOf(10,39))
    print(whenExpression(10))
}
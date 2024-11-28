package basics

fun stringLength(a:Any):Int?{
    if(a is String){
        return a.length
    }
    return null
}

fun main() {
    val num = 100;
    val str = stringLength("num")
    println(str)

}
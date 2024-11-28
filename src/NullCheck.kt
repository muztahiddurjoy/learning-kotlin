fun parseInt(num:String):Int?{ // this function can return null
    return num.toInt()
}
fun main() {
  val num = parseInt("10")
    if(num==null){
        println("got null")
    }
    else{
        println("the value is $num")
    }
}
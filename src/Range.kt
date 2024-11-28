fun main(){
    val num:Int = 10
    if(num in 1..20){
        println("in range of 1 to 20")
    }
    if(num !in 20..30){
        println("Not in range of 20 to 30")
    }
    for (x in 9 downTo 0 step 2){
        println(x)
    }
}
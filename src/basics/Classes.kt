package basics

class Random // initialize first

fun Random.name(){ //declare Property then
    println("shin chan")
}

class Triangle(height:Double,vumi:Double){
    val area = 0.5*vumi*height
    fun sayHello(){
        println("Hello! I am a triangle")
    }
}
fun main(){
    Random().name()
    val isoscale = Triangle(10.0,20.0)
    println(isoscale.area)
    isoscale.sayHello()
}
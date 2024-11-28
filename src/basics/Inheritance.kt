package basics

open class Shape(val name:String){ // the class should be declared as open to be inheritable
    fun sayHello(){
        println("My name is $name")
    }
}

class Rectangle(): Shape("Rectangle"){ // this how inheritance work in kotlin

}

fun main(){
    val rect = Rectangle()
    println(rect.name)
    rect.sayHello()
}
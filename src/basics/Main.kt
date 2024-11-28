package basics

fun main(args:Array<String>){
    println(args.contentToString())
    println("Enter your name")
    val name:String = readln(); //takes user input
    println("My name is $name")
}


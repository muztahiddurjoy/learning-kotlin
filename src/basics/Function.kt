package basics

fun addNumber(a:Int, b:Int):Int{ //creating a new function which will take two number and add them
    return a+b
}

fun addNumberReturns(a:Int,b:Int) = a+b  // return type will be inferred if we use it as an expression

fun randomValue(a:Int,b:Int):Unit{ //similar to void, (default return type of function if no return type is specified)
    println("The multiplication of $a and $b is ${b*a}")
}

fun main(args:Array<String>){
  randomValue(10,20)
}

val name:String = "Muzzz" // can I declare a variable outside a function?
fun main(){
  val immuVar:Int = 100 //variable defined with val is immutable
  var muVar:Int = 200 //variable defined with var is mutable
    // immuVar++  it will throw an error
    muVar++ //it will not

    val age = 20 //kotlin can infer the type
    val grade:Int //but not for late initialization
    grade = 10 //this will not throw an error because val keyword supports you to assign the value of the variable only once. it is not mandatory to assignment it while initializing
  println("My name is $name") //yes you can
    println("My age is $age")
    println("My grade is $grade")
}
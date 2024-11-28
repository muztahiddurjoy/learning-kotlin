package idioms

val p:String by lazy { // the value will never initialize if the variable is not used
    "random"
}

fun main() {
  println(p)
}
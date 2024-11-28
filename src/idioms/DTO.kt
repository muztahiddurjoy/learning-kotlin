package idioms

data class DTOTest(var name:String,val email:String) //it will create getter setter and other stuffs auto

fun main() {
    val mama = DTOTest("Muztahid","random@gmail.com")
    mama.name = "Random"
}
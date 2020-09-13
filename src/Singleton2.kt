class B(){
    init {
        println("class init method, Singleton name property")
    }
    object Singleton{
        init {
            println("singleton class invoked")
        }
        var name = "Kotlin Objects"
        fun printName(){
            println(name)
        }
    }
}
fun main() {
    var b = B()
}
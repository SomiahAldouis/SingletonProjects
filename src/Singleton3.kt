class C(){
    init {
        println("Class Init Method")
    }
    object SingletonA{
        init {
            println("singletonA class invoked")
        }
        var name = "Kotlin Objects A"
        fun printName(){
            println(name)
        }
    }
    companion object SingletonB{
        init {
            println("singletonB class invoked")
        }
        var name = "Kotlin Objects B"
        fun printName(){
            println(name)
        }
    }
}

fun main(){
    var c=C()
    var c1=C.name
    C.name="Kotlin Tutorials"
    C.printName()
}
object Singleton{
    init{
        println("singleton class invoked")
    }
    var name = "Kotlin Objects"
    fun printName(){
        println(name)
    }
}

class A(){
    init {
        println("class init method, Singleton name property: ${Singleton.name}")
    }
}

fun main(){
    Singleton.printName()

    Singleton.name="SS"
    var a=A()
}
fun main(args: Array<String>) {

    val a= gettersetterclass()
    println(a.namee)
//a.namee="rahul"
    a.namee="Rahul"
    println("new name is ${a.namee}")
}

class gettersetterclass{
    var namee: String="Default name"
        get() = field
        set(value) {
            println(value.length)
            if (value.length>6){

               field=value
            }else
            {
                println("You can not set value")
            }
        }
}
fun main(args: Array<String>){


val a:parents=plusss(10)
    val b: parents=multiplication(10)
    println(a.calculate())
    println(b.calculate())

}
open class parents(){

    open fun calculate(): Int{

        return 0
    }
}
class plusss (val value: Int): parents(){

    override fun calculate(): Int{
      return value+value
    }
}
class multiplication(val value: Int): parents(){

    override fun calculate(): Int{
        return value * value
    }
}
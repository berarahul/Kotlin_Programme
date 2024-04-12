fun main(args: Array<String>){

    val obj=calculations()
    obj.add()
    obj.multiplication()
    println(obj.a)
    println(obj.b)


}

class calculations{

    //Data Members

    var a =24
    var b=21

    // Methods
    fun add(){
        println("Sum of Two number is:: ${a+b}")
    }
    fun multiplication(){
        println("Multiplication of two number is:: ${a*b}")

    }

}
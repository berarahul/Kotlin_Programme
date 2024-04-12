fun main(args: Array<String>){

    println("Enter input")

    val input= readLine()?:""
    //println(input.toString())

   // val inputnum=input.toInt()

   // println(input)
val booleaninput=input.toBoolean()
    println(booleaninput)
    println(booleaninput::class.java)
}
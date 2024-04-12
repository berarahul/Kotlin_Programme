
// PRIMARY CONSTRUCTOR EXAMPLE

//fun main(args: Array<String>){
//
//
//    val a=example(s="Rahul",i=20,d=20.0)
//}
//
//class example(s:String,i:Int,d:Double){
//
//
//    init {
//        println(s)
//        println(i)
//        println(d)
//    }
//
//}


//SECONDARY CONSTRUCTOR
fun main(args: Array<String>){


   val a= example(s="Rahul",int=20,double=20.0)
    val ans=a.sum(10,20)
    println(ans)
}

class example(s: String,int: Int,double: Double){

    fun sum(value1:Int,value2:Int):Int{
        return value1 + value2
    }

}
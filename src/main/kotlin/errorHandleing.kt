import java.lang.Exception

fun main(args: Array<String>){



    try {
        val a:String?=null
        println(a!!.length)
    }catch (e:Exception){

        println("Error message is $e")
    }finally {
        println("Code Running...")
    }
}
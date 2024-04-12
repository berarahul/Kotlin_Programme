fun main(args: Array<String>){
    val a= exampleclass()
    a.first()

}
class exampleclass(){

    fun first(){
        println("hello i am first function>>>")
    }


    init {
        println("Hello I am init block:: ")
    }
}
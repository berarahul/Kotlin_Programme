fun main(args: Array<String>){

    val a=Names()
    a.rahul()
}

class  Names(){

    lateinit var name: String
    fun rahul(){
        name = "Rahul"
        println("My name is $name")
    }
    fun vipin(){
        name="Vipin"
        println("My name is $name")
    }
    fun subham(){
        name="Subham"
        println("My name is $name")
    }
}
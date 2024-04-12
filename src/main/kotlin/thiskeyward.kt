fun main(args: Array<String>){


    val a=democlass()

    println(a.name)
    a.newfunction("Rahul")
    println(a.name)
}

class democlass(){
    var name: String="no name"
    fun newfunction(name: String){
        this.name=name

    }


}
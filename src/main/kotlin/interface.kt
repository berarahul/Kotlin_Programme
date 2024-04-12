fun main(args: Array<String>){

val student1: student=getstudent()
    student1.readbook("Rich Dad poor Dad")
    student1.reading()
    student1.writting()

}

interface student{

    val name:String
    fun reading()
    fun writting()
    fun readbook(bookName:String){
        println("Student is reading  $bookName book")
    }
}

class Rahul() : student{
    override val name: String="Example Book"
    override fun reading() {
       println("Student is reading")
    }

    override fun writting() {
       println("Student is writting")
    }

}
fun getstudent(): student{
    return  Rahul()
}
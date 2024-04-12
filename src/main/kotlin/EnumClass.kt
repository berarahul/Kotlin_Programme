fun main(args: Array<String>){

 val imagecount=API.Image.size
    println(imagecount)

}
enum class API(val size:Int){

    Image( 100),
    Videos(10),
    Audio(20),
    PDF(5)
}
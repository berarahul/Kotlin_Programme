fun main(args: Array<String>){
    val bmw:Typeofvehicle=car("BMW")
    val i20:Typeofvehicle=car("I 20")
    val Honda:Typeofvehicle=Bike("Honda Spelander",60000.0)
    val Discover:Typeofvehicle=Bike("Discover",80000.0)


}
sealed class  Typeofvehicle

class car(val name: String): Typeofvehicle()
class Bike(val name: String, val price: Double): Typeofvehicle()
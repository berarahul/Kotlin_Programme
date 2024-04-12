 fun main(args: Array<String>){

val customer1=indianHotel()
     customer1.food()
     val customer2=chineseHotel()
     customer2.food()
     val customer3=FrenchHotel()
     customer3.food()


 }

 interface  Hotel{

     fun food()


 }

 class indianHotel: Hotel{
     override fun food() {
        println("Indian Food Is Available")
     }


 }
 class chineseHotel : Hotel {
     override fun food() {
         println("Chinese Food is Available")
     }
 }
 class FrenchHotel : Hotel {
     override fun food() {
         println("France food is Available")
     }

 }
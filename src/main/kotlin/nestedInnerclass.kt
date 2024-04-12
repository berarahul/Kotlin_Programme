fun main(args: Array<String>){
    val bmw=Car()
    val seconedBmw=Car().otherCar()
    seconedBmw.print()


}

class Car(){


    var tire:Int=0
   inner class otherCar(){


        fun print(){
            println("Car is Running")
        }
    }
}
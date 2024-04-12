//import kotlin.random.Random
//
//fun main(args: Array<String>){
//    val randomnumber= Random.nextInt(1,5)
////    println(randomnumber)
//
//        var i=0
//    while (i<3){
//
//        println("Enter Any Number")
//        val a= readLine()?:""
//        val userGuessNumber=a.toInt()
//        if (userGuessNumber==randomnumber){
//            println("You are Win!")
//        }else{
//            println("You have ${2-i} try remain")
//            println("Try Again!")
//        }
//        i++
//    }
//
//    }
import kotlin.random.Random

fun main(args: Array<String>) {
    val randomNumber = Random.nextInt(1, 5)
//println(randomNumber)
    while (true) {
        println("Enter any number 1 to 5")
        val userGuessNumber = readLine()?.toIntOrNull()

        if (userGuessNumber == randomNumber) {
            println("You are Win!")
            break  // Exit the loop if the user wins
        } else {
            println("Try Again!")
        }
    }

    println("Thank you for playing. The random number was $randomNumber.")
}

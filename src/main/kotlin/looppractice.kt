fun main(args: Array<String>){

//    println("Enter any value")
//val a = readLine()?:""
//     val size=a.toInt()
//
//    for (i in 1..size){
//
//        println("Number index of is $i")
//
//    }


    //Example 2

//    val list= arrayListOf<Int>(1,2,3,4,5,6,9,0)
//    for (i in list){
//        println("List data is $i")
//    }

    val hashlist = hashMapOf(
        "ColdDrinks" to "sprite",
        "milk" to "Amul",
        "fruits" to "Apple",
        "flower" to "Rose"
    )
    for (i in hashlist.keys){
        println(hashlist[i])
    }

    //❤️

   for (i in 0..5){

       for (j in 0..i){
           print("❤")
       }
       println()
   }
}
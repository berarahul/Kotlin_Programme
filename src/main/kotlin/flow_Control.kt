fun main(args: Array<String>){


    // IF ELSE CONDITION

    // Example 1

//    println("Are you Hungry")
//    val a = readLine()
//    val isHungry=a.toBoolean()
//    if (isHungry==true){
//        println("you can eat food")
//    }
//    else{
//        println("you can not food")
//    }

 //Example 2

//     println("Enter your Right age?")
//    val b= readLine()?:""
//    val age=b.toInt()
//    if (age<18){
//        println("You can not smoke")
//    }else
//    {
//
//        println("You can smoke")
//    }


//    Example 3

//
//    val shopproduct= listOf<String>("Laptop","mouse","Speaker","Keyboard")
//    println("What you want to purchese")
//    val c= readLine()?:""
//    if (c.toString().equals(shopproduct[0])){
//        println("You can purchese ${shopproduct[0]}")
//    }else if (c.toString().equals(shopproduct[1]))
//    {
//        println("You can purchese ${shopproduct[1]}")
//    }


// Example 4
       println("Enter the number")
    val number=readLine()?:""
    val  num=number.toInt()
   val remainder=num%2
    println(" remainder is:: $remainder") //remainder 0  13 remainder is 1
    if (num%2==0){
        println("$num is Even Number")
    }else{
        println("$num is not even number")
    }
}
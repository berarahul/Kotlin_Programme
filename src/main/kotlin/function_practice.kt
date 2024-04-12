
//Example 1
//fun main(args: Array<String>){
//
//    val ans=multiolication(10,20)
//    println(ans)
//
//}
//
//fun multiolication(value1:Int,value2:Int)=value1*value2


//Example 2

//fun main(args: Array<String>){
//
//    println("Enter your Name")
//    val a= readLine()?:""
//    println("Enter Year Birth Year")
//    val b= readLine()?:""
//    val c=b.toInt()
//    countage(a,c)
//}
//
//fun countage(name: String,Byear: Int){
//    val age=2023-Byear
//    println("Your name is $name and your age is $age")
//}

//Example 3

//fun main(args: Array<String>){
//
//
//    val list= arrayListOf<String>("A ","B ","C ","D ","E")
//    pritnlist(list)
//}
//fun pritnlist(list: ArrayList<String>){
//    for (i in list){
//        print(i)
//    }
//}

//Example 4



//fun main(args: Array<String>){
//    val ans1 = sumWithVal(1, 2)
//    val ans2 = sumWithValue(3, 4)
//
//    println("Sum with val: $ans1")
//    println("Sum with value: $ans2")
//}
//
//fun sumWithVal(val1: Int, val2: Int): Int = val1 + val2
//
//fun sumWithValue(value1: Int, value2: Int): Int = value1 + value2


//Example 5
fun main(args: Array<String>){

    println("Enter q of product")
    val a= readLine()?:""
    val q=a.toInt()
    println("Enter the prize of product ")
    val b= readLine()?:""
    val prize=b.toInt()

//makebill(q, prize)
    // price 90 q=10
println(makebill(q, prize))
}

fun makebill(q: Int, prize: Int): Double{
    val totalamount_ofbill = q*prize
    val discount=totalamount_ofbill*0.10
    val finalrate=totalamount_ofbill-discount
    return finalrate
}
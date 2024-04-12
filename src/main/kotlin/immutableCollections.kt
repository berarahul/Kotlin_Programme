//import jdk.internal.net.http.common.Pair.pair


fun main(args: Array<String>){

    //ListOf

//    val rollno= listOf<Int>(1,2,3,4,5,6,7,8)
//    println(rollno[4])
//    println(rollno.size)
//    println(rollno.indexOf(9))

//    setOf
//    val number= setOf<Int>(1,1,1,2,2,2,2,3,4,4,5,5,6,7,8)
//    println(number)
//    println(number.size)
//    println(number.indexOf(5))

    //Map
    val immutableMap: Map<String, Int> = mapOf(
        "key1" to 1,
        "key2" to 2,
        "key3" to 3
    )

    println(immutableMap["key1"]) // Output: 1
    println(immutableMap["key2"]) // Output: 2

}




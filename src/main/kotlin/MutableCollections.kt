//import jdk.internal.net.http.common.Pair.pair

fun main(args: Array<String>) {

//    val list = mutableListOf<String>(
//        "A",
//        "B",
//        "C",
//        "D",
//        "E",
//        "F",
//        "G",
//        "H",
//        "I",
//        "J",
//        "K",
//        "L",
//        "M",
//        "N",
//        "O",
//        "P",
//        "Q",
//        "R",
//        "S",
//        "T"
//    )
//    val newList = mutableListOf<String>("X", "Y", "Z")
//    list.addAll(newList)
//    println(list)
//    list.add("U")
//    list.add("V")
//    list.add("w")
//    println(list.removeAt(0))
//    println(list)
//list.removeAll(list)
//}


//    mutablesetof


//    val data = mutableSetOf<String>("A","A","B")
//    println(data)

    val mutableMap: MutableMap<String, Int> = mutableMapOf(
        "key1" to 1,
        "key2" to 2,
        "key3" to 3
    )
    mutableMap["key4"] = 4 // Adding a new key-value pair
    mutableMap["key2"] = 20 // Updating the value for an existing key
    mutableMap.remove("key1") // Removing a key-value pair by key

// Adding a key-value pair using put()
    mutableMap.put("key5", 5)

// Removing a key-value pair using remove()
    mutableMap.remove("key3")
 println(mutableMap)

}
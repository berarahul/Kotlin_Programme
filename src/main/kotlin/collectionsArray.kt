fun main(args: Array<String>){

    val list= arrayListOf<String>("f","t","v","b")
    val newList= arrayListOf<String>("fa","ta","va","ua")
    list.add("saa")
    list.remove("f")
    list.indexOf("t")
    list.addAll(newList)
    list.removeAll(newList)
//    list.clear()
    println(list.isEmpty())
    println(list)
println(list.contains("f"))
}


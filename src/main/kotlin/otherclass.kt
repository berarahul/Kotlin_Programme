fun main(args: Array<String>){


    //Data Class
    val list= arrayListOf<Developer>()

   list.add(Developer(
       name = "Rahul",
       surname="Bera",
       age = 23,
       pro = "Android Developer"

   ))
    list.add(Developer(
        name = "Arpan",
        surname="Duari",
        age =22,
        pro = "Python Developer"
    ))
    list.add(Developer(
        name = "Tusar",
        surname ="Mondal",
        age=20,
        pro = "UI/UX Desginer"
    ))
    for (item in list){
        println(item)
        print(item.name)
    }
}
data class Developer(
    var name:String="",
    var surname:String="",
    var age:Int=0,
            var pro: String=""
)
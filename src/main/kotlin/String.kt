fun main(args: Array<String>){

    val  a ="rahul"
    val b="Bera"
    //length function here Detect the String Size Basically
    println(a.capitalize()) // This Function Basically convert to Capital of String First Letter
    println(b.decapitalize()) //This Function Basically convert to Small  of String First  Letter
    println(a.length)
   println(a.get(0))  //Get Basically use in java but kotlin you can define the Storage location [0]
    println(a[1])   // In kotlin use in This Way
    println(b[2])

    // SubString

    val c="My Name is Rahul"
    println(c.substring(2))  // here we define 2 in that reason my was Remove
    println(c.substring(2,5))  // here print only between location 2 to 5


}
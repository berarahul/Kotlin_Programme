fun main(args: Array<String>){

//
//    println("Enter the number")
//    val a= readLine()?:""
//    val number=a.toInt()
//    when(number){
//
//        0->{
//            println("one execute")
//        }
//        1->{
//
//            println("Two Execute")
//        }
//        2->{
//            println("Three execute")
//        }
//        else->{
//            println("Invalid Output")
//        }
//
//    }

//    Example 2
// println("Enter launguage name")
//    val b= readLine()?:""
//    when(b){
//        "java"->{
//            println("Current version of java is 19.4.0")
//        }
//        "kotlin"->{
//            println("Current version of kotlin is 1.5.0")
//        }
//        "python"->{
//            println("Current version of python is 2.4.0")
//        }
//        else->{
//
//            println("invalid input")
//        }
//    }
//
//    Example 3
    println("Enter the number:: ")
     val c = readLine()?:""
    val time=c.toInt()
    when(time){


        in 6..12->{
            println("Good Morning!")
        }
        in 12..16->{

            println("Good afternoon")
        }
        in 16..19->{

            println("Good Evening")
        }
        in 19..24->{
            println("Good Night")
        }
        else->{
            println("Invalid Number type!!")
        }

    }

}
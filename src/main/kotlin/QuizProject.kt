fun main(args: Array<String>){

    val listOfQuiz= arrayListOf<Questions>()

    println("Welcome to Quiz App Using Kotlin")

    var RightAnswer=0
    var WrongAnswer=0
    listOfQuiz.add(Questions("Which is official Language for android Development?",
        "Kotlin",
        "Python",
        "PHP",
        "JAVA",
        "Kotlin"))

    listOfQuiz.add(Questions("Which Symbol is use to Single line comment in kotlin",
        "__",
        "{}",
        "..",
        "//",
        "//"))

    listOfQuiz.add(Questions("Which Function is used to get data from user in Kotlin",
        "while()",
        "Expression",
        "ReadLine()",
        "for()",
        "ReadLine()"))
    println("Press 1 to Start Game")
    println("Press 2 to Exit Game")
    val a= readLine()?:""
    val choose=a.toInt()
    when(choose){
        1->{
            for(items in listOfQuiz) {
                println("Questions  : ${items.questions}")
                println("Questions A : ${   items.questionsA}")
                println("Questions B : ${   items.questionsB}")
                println("Questions C: ${  items.questionsC}")
                println("Questions D : ${   items.questionsC}")
                println("_________________________________________________________________________")
                println("Enter Your Answer")
                val ans= readLine()?:""
                if (ans.equals(items.ans)){
                    RightAnswer++
                    println("Answer is Right")
                }else{
                    WrongAnswer++
                    println("Sorry Your answer is Not Right")
                }

            }
            println("Congratulation Your game is Over")
            println("Right answer is: $RightAnswer")
            println("Wrong answer is: $WrongAnswer")

        }
        2->{
                  //Exit
        }
        else->{
                  //Exit
        }
    }
}
data class Questions(

    val questions: String="",
    val questionsA: String="",
    val questionsB: String="",
    val questionsC: String="",
    val questionsD: String="",
    val ans: String=""

)


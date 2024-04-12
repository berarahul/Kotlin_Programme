fun main(args: Array<String>) {
var currentbal=10000
    println("Welcome to Sastawala ATM Machine:: ")
    println("Enter 1 for Check Balance:: \n Enter 2 For Deposit Money\n Enter 3 for Withdraw Money\n Enter 4 for Exit ATM")
    val a = readLine() ?: ""
    val userinput = a.toInt()

        when (userinput) {
            1 -> {
                println("Your Current Balanced is  $currentbal")
            }

            2 -> {
                println("How Much Money do you want To Deposit? ")
                val b= readLine()?:""
                val amount=b.toInt()
                currentbal+=amount
                println(" $amount Money is Successfully Deposit in your Bank Account!!")
                println("Now You Have $currentbal Balance")
            }

            3 -> {
                println("How Much Money do you want to Withdraw ?")
                val b= readLine()?:""
                val amount=b.toInt()
                if (amount<currentbal){
                currentbal-=amount
                println(" Now Your current balanced is $currentbal")
            }
else{
    println("Insufficient fund!")

                }}
            4 -> {
                println("Thank You!")

            }
            else ->{
                println("please select the correct Options..")
            }

        }

    }

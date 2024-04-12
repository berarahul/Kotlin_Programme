fun main(args: Array<String>){

    println("Enter Q of Product")
    val product= readLine()
    val productvalue = 20
    println("Final prize is ${product!!.toInt()?.times(productvalue)}")


}

//!! not null Assertion symbol

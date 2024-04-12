fun main(args: Array<String>){


 val a= parent.sum(13)
    println(a.calculations())
    val b= parent.mul(12)
    println(b.calculations())
}

abstract class parent(){

    abstract fun dataprinting()
    abstract  fun calculations():Int


    class sum(val value1: Int):parent() {
        override fun dataprinting() {
            println("sum is getting print")

        }

        override fun calculations(): Int {
        return value1+value1
        }
    }
    class mul(val value1: Int):parent() {
        override fun dataprinting() {
            println("mul is getting print")
        }

        override fun calculations(): Int {
            return value1*value1
        }
    }
}
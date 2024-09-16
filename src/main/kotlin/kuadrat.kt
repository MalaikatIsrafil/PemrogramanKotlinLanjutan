import kotlin.math.sqrt

//Menghitung Akar Kuadrat

fun main(args: Array<String>) {
    // calculate square root
    // sqrt() is an abbreviation of SQuare Root,

    print("Enter some number and I'II calulate a square root : ")
    val a = readLine()!!.toDouble()
    if (a > 0){
        println("The number you entered is greater than 0, so I can calculate it!")
        val root = sqrt(a);
        println("The square root of $a is $root")
    } else
        println("I can't calculate the square root of a negative number! ")
    println("Thanks for the input")
}
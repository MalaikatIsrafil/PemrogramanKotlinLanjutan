fun main(args: Array<String>) {
    println("Enter a number betwen 10-20 : ")
    val a = readLine()!!.toInt()
    if ( a >= 10 && a <= 20){
        println("The condition has been met")
    } else {
        println("You did it wrong.")
    }

    println("\n Enter a number betwen 10-20 or 30-40")
    val b = readLine()!!.toInt()
    if (((b >= 10) && (b <= 20)) || ((b >= 30) && (b <= 40))){
        println("The codition has been meet.")
    } else{
        println("You did it wrong")
    }
}
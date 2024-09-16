fun main(args: Array<String>) {

    // Kalkulator Sederhana Menggunakan Percabangan When

    println("Welcome to our calculator")

    println("Enter the first number : ")
    val a = readLine()!!.toDouble()

    println("Enter the second number : ")
    val b = readLine()!!.toDouble()

    println("Chose one of the following operation : ")
    println("1 - addition ")
    println("2 - substraction ")
    println("3 - multiplication ")
    println("4 - division ")
    
    val choice = readLine()!!.toInt()
    var result = 0.0

    when (choice){
        1 -> result = a + b
        2 -> result = a - b
        3 -> result = a * b
        4 -> result = a / b

    }
    if ((choice > 0) && (choice < 5)){
        println("Result : $result")
    }
    println("Thank you for using our calculator. ")
}

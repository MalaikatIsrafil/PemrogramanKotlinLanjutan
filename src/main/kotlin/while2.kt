fun main(args: Array<String>) {
    // Penerapan While-Loop dalam Kalkulator Sederhana

    println("Welcome to our calculator")

    var go0n = "yes"

    while (go0n == "yes"){

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
        } else{
            println("Invalid choice")
        }
        println("would you like to make another calculation ? [yes/no]")
        go0n = readLine()!!

    }
    println("Thank you for using our calculator. ")

}
fun main(args: Array<String>) {

    // Kalkulator Sederhana Menggunakan Percabangan IF-ELSE IF
    
    println("Welcome to our calculator")

    println("Enter the first number : ")
    val a = readLine()!!.toDouble()

    println("Enter the second number : ")
    val b = readLine()!!.toDouble()

    println("Chose one the following operations : ")
    println("1 - addition")
    println("2 - substraction")
    println("3 - multiplication")
    println("4 - division")

    val choice = readLine()!!.toInt()
    var result = 0.0

    if (choice == 1){
        result = a + b
    } else if (choice == 2 ){
        result = a - b
    } else if (choice == 3){
        result = a * b
    } else if (choice == 4){
        result = a / b
    }
    if ((choice > 0) && (choice < 5)){
        println("result : $result")
    } else {
        println("Invalid choice")
    }
    println("Thank you fo using our calculator")


}
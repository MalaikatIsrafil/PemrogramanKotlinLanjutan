fun main() {

    //Percabangan IF, IF-ELSE, IF-ELSE IF

    if (15 > 5)
        println("True")
    println("The program continues here...")

    //If - Else
    val a:Int = 5
    val b:Int = 2
    val max : Int

    if (a > b){
        max = a
    } else{
        max = b
    }
    println("Maximum of a or b is " + max)

    // if - else if
    var myVar: Int = 0 //the variabel is initialized with a value of 0
    if ( myVar == 0){  //if the value is 0, we change its value to 0
        myVar = 1
    } else if (myVar == 1){  // if the value is 1, we change its value to 0
        myVar = 0
    } else {
        myVar = -1
    }
    println("Nilai myVar adalah " + myVar)

    print("\n Enter a number : ")
    val intNumber = readLine()!!.toInt()
    if (intNumber > 5)
        println("The number you entered is grater than 5!")
    println("Thanks for the input!")

}
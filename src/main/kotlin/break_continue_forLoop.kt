
// break dan continue label pada perulangan for-loop

fun main(args: Array<String>) {
    //Continue & Break label

    println("Example of Break Continue Label")
    mylabel@ for (x in 1..10) { // appling the custum Label
        if (x == 5){
            println("I am inside if block with value " + x + "\n-- hence it will close the operation")
            break@mylabel //Specifing the label
        } else {
            println(" I am inside else block with value " + x)
            continue@mylabel
        }
        println("Not Print")

    }
}
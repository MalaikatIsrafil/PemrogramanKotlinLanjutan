fun main(args: Array<String>) {

    //When adalah operator pengganti switch-case di bahasa pemrograman C
    // Use of when

    var x: Int = 5
    when (x) {
        1 -> println("x == 1 ")
        2 -> println("x == 2 ")
        else -> { // note the block
            println("x is neither 1 or 2")
        }
    }
    x = 2
    when (x){
         1, 2 -> println("Value of X either 1,2")
        else -> { // Note the block
            println("x is neither 1 or 2")
        }
    }
}
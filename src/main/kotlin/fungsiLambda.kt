
//penggunaan fungsi lambda:

fun main(args: Array<String>) {
    println(MyFunction("Rekayasa Perangkat Lunak"))

    // Lambda Function
    val mylambda : (String) -> Unit = {s: String -> print(s) }
    val v:String = "Jurusan Teknik Informatika"
    mylambda(v)

    // INline Function
    myFun(v, mylambda) //passing lambda as a parameter of another function

}
fun MyFunction(x: String): String{
    var c: String = "Hey!! Welcome To ----"
    return (c + x)
}

fun myFun (a:String, action:(String)-> Unit){
    print("\nHeyyy!!!")
    action(a)
}
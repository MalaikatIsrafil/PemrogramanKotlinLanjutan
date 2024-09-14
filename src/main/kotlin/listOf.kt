fun main(args: Array<String>) {

    val number = listOf("one", "two", "three", "four")
    println("Number of elements : ${number.size}")
    println("Thrid element : ${number.get(2)}")
    println("Fourth element: ${number[3]}")
    println("Index of element \"two\" ${number.indexOf("Two")}")

    //List element (including nulis) can duplicate
    val bob = Person("bob", 31)
    val people = listOf<Person>(Person("Adam", 20),bob, bob)
    val people2 = listOf<Person>(Person("Adam", 20), Person("Bob", 31), bob)
    println(people == people2)
    bob.age = 32
    println(people == people2)

}

class Person(var name : String, var age: Int){

}
fun main() {
    //Set<T> stores unique element; their order is generally undefined

    val numbers = setOf(1,2,3,4)
    println("Number of element :  ${numbers.size}")
    if (numbers.contains(1)) println("1 is in the set")

    val numbersBackwards = setOf(4,3,2,1)
    println("The sets are equal: ${numbers == numbersBackwards}")

    //The default implementation of set - LinkedHashSet - preserves the order of element insertion
    println(numbers.first() == numbersBackwards.first())
    println(numbers.first() == numbersBackwards.last())

    val string = hashSetOf("a", "b", "c", "c") //hash srt value unik
    println("My set values are " + string)

}
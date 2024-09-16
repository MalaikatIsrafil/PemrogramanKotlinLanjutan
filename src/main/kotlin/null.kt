fun main(args: Array<String>) {
    // Nullable types
    var maybeNumber : Int? = 15
    maybeNumber = null
    println("mybeNumber : $maybeNumber ${maybeNumber?.hashCode()}")
}
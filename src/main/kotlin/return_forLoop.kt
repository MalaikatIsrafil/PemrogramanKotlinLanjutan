
//return pada perulangan for-loop:

fun main(args: Array<String>) {
    returnLoop() //pada awalnya merah
}

fun returnLoop(){ //membuat agar yang atas terdefinisi
    for (x in 1..10){
        if (x < 5){
            print("${x - 1}")
        } else {
            return
        }
        print("$x")
    }
    print("Tidak akan pernah dieksekusi")

}
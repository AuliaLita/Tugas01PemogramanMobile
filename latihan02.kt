fun main(args: Array<String>) {
    println("4 pangkat 3 = ${pangkat(4,3)}")

}
inline fun pangkat(pangkat: Int, angka: Int): Double {
    return Math.pow(pangkat.toDouble(), angka.toDouble())
}



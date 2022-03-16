import java.lang.Math

fun main(args: Array<String>) {
    val x1 = 2.0
    val y1 = 3.0
    val x2 = 8.0
    val y2 = 7.0
    val x3 = 5.0
    val y3 = 3.0
    val x4 = -8.0
    val y4 = -4.0

    println("Jarak antara titik t1(2,3) dan t2(8,7): " +Jarak(x1, y1, x2, y2))
    println("Sedangkan, Jarak antara titik t1(5,3) dan t2(-8, -4): "+Jarak2(x3, y3, x4, y4))
}

fun Jarak(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double

): Double {
    val titik = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1)
    return Math.sqrt(titik)

}
fun Jarak2(
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double

    ): Double {
    val titik2 = (x4 - x3)*(x4 - x3) + (y4 - y3)*(y4 - y3)
    return Math.sqrt(titik2)

}


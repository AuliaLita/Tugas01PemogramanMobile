class Barang (nama: String, harga: Int = 100000, jumlah: Int = 1, diskon: Double = 0.2) {
    val nama = nama
    var harga = harga
    var jumlah = jumlah
    var diskon = diskon

    fun tampil() {
        println("Nama barang : " + nama)
        println("Harga barang: " + harga)
        println("Jumlah barang : " + jumlah)
        println("Diskon(%) : " + diskon)
    }

    fun hitungTotal () {
        var potongan = harga * jumlah * diskon
        var totalHarga = harga - potongan
        println("Total diskon: " +potongan)
        println("Total Pembayaran: " +totalHarga)
    }
}

fun main(args: Array<String>) {
    val Jeans = Barang("Celana Jeans")
    Jeans .tampil()
    Jeans .hitungTotal()
}
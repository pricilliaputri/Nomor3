fun main() {
    print("Masukkan angka pertama: ")
    val angka1 = readLine()!!.toDouble()

    print("Masukkan angka kedua: ")
    val angka2 = readLine()!!.toDouble()

    print("Masukkan operator (+, -, *, /): ")
    val operator = readLine()

    val hasil: Double?

    when (operator) {
        "+" -> hasil = angka1 + angka2
        "-" -> hasil = angka1 - angka2
        "*" -> hasil = angka1 * angka2
        "/" -> hasil = angka1 / angka2
        else -> {
            println("Operator yang dimasukkan tidak valid")
            return
        }
    }

    println("Hasil dari $angka1 $operator $angka2 adalah $hasil")
}

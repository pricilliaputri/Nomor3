fun main() {
    // Input berat dan tinggi badan dari pengguna
    print("Masukkan berat badan Anda (kg): ")
    val weight = readLine()!!.toDouble()

    print("Masukkan tinggi badan Anda (cm): ")
    val height = readLine()!!.toDouble() / 100

    // Hitung BMI dan tampilkan hasilnya
    val bmi = weight / (height * height)
    println("BMI Anda adalah $bmi")

    // Berikan keterangan berdasarkan kategori BMI
    when {
        bmi < 18.5 -> println("Anda termasuk dalam kategori berat badan kurang")
        bmi < 25 -> println("Anda termasuk dalam kategori berat badan normal")
        bmi < 30 -> println("Anda termasuk dalam kategori berat badan berlebih")
        else -> println("Anda termasuk dalam kategori obesitas")
    }
}

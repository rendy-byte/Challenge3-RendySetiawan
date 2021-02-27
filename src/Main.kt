fun main() {
    do {
        println("============================")
        println("| GAME BATU GUNTING KERTAS |")
        println("============================")
        print("Masukkan Pilihan MU : ")

        val input1 = readLine()?.toInt()
        val input2 = (1..3).random()
        println("Pilihan Player 2 : $input2")
        println()

        println("------Hasilnya Adalah-----")

        val aksi = Aksi(keluarLah)
        if (input1!! >= 4) {
            println("Sorry, nilai yang kamu masukkan salah")
        } else {
            aksi.hasil(
                input1.minus(1),
                input2.minus(1)
            )
            println()
        }

    } while (input1!! <= 3)
    println()

}

val keluarLah = object : Call {
    override fun munculkanHasil(msg: String) {
        println(msg)
    }
}


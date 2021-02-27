class Aksi(private val keluarlah: Call) {
    val data = mutableListOf("GUNTING", "BATU", "KERTAS")

    fun hasil(player1: Int, player2: Int) {
        val p1 = data[player1]
        val p2 = data[player2]

        when {
            p1 == data[2] && p2 == data[0] ||
                    p1 == data[0] && p2 == data[1] -> {
                        keluarlah.munculkanHasil("Player 2 Menang!")
                    }
            p1 == data[2] && p2 == data[0] ||
                    p1 == data[0] && p2 == data[2] -> {
                        keluarlah.munculkanHasil("Player 1 Menang!")
            }
            p1 == data[2] && p2 == data[0] ||
                    p1 == data[1] && p2 == data[2] -> {
                keluarlah.munculkanHasil("Player 2 Menang!")
            }
            p1 == data[2] && p2 == data[0] ||
                    p1 == data[2] && p2 == data[1] -> {
                keluarlah.munculkanHasil("Player 1 Menang!")
            }
            else -> {
                keluarlah.munculkanHasil("DRAW!")
            }
        }

        keluarlah.munculkanHasil(
            "Player1 = $p1," +
                    " Player2 = $p2"
        )
    }
}
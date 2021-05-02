class Game {
    fun printHeader() {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
    }
    fun gameInput() {
        print("Masukkan pemain 1: ")
        val input1 = readLine()
        print("Masukkan pemain 2: ")
        val input2 = readLine()
        println("Hasil :")
        if (input1 == "gunting" && input2 == "gunting") {
            println("DRAW!")
        } else if (input1 == "gunting" && input2 == "batu") {
            println("Pemain 2 MENANG!")
        } else if (input1 == "gunting" && input2 == "kertas") {
            println("Pemain 1 MENANG!")
        } else if (input1 == "kertas" && input2 == "kertas") {
            println("DRAW!")
        } else if (input1 == "ketas" && input2 == "batu") {
            println("Pemain 1 MENANG!")
        } else if (input1 == "kertas" && input2 == "gunting") {
            println("Pemain 2 MENANG!")
        } else if (input1 == "batu" && input2 == "batu") {
            println("DRAW!")
        } else if (input1 == "batu" && input2 == "gunting") {
            println("Pemain 1 MENANG!")
        } else if (input1 == "batu" && input2 == "kertas") {
            println("Pemain 2 MENANG!")
        } else {
            println("inputan salah")
        }
    }

}


import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    repeat(readLine().toInt()) {
        val arrAB = readLine().split(" ").map { it.toInt() }
        var drainage = arrAB.max()

        while (true) {
            if(drainage % arrAB[0] == 0 && drainage % arrAB[1] == 0) {
                println(drainage)
                break
            } else {
                drainage += arrAB.max()
            }
        }
    }
}
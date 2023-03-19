import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    while (true) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        if(a == 0 && b == 0) break
        else {
            if(a > b && a % b == 0) println("multiple")
            else if(a < b && b % a == 0) println("factor")
            else println("neither")
        }
    }
}
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a1, b1) = readLine().split(" ").map { it.toInt() }
    val (a2, b2) = readLine().split(" ").map { it.toInt() }
    val (a3, b3) = readLine().split(" ").map { it.toInt() }

    if(a1 == a2) print("$a3") else if(a2 == a3) print("$a1") else print("$a2")
    if(b1 == b2) print(" $b3") else if(b2 == b3) print(" $b1") else print(" $b2")
}
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val readNum = readLine().toInt()
    if(readNum == 0) print(1) else print("${factorial(readNum)}")
}

fun factorial(n: Int): Long = if(n == 1) n.toLong() else n * factorial(n-1)
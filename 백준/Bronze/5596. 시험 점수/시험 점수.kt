import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val people1 = readLine().split(" ").sumOf { it.toInt() }
    val people2 = readLine().split(" ").sumOf { it.toInt() }

    if(people1 > people2) print(people1) else print(people2)
}
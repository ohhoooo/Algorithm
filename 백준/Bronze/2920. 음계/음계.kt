import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    when(val numbers = readLine().split(" ").map { it.toInt() }) {
        numbers.sorted() -> print("ascending")
        numbers.sortedDescending() -> print("descending")
        else -> print("mixed")
    }
}
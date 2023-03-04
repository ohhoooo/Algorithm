import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val numbers = readLine().split(" ").map { it.toInt() }
    var sum = 0

    repeat(5) {
        sum += numbers[it] * numbers[it]
    }

    print(sum % 10)
}
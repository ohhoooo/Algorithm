import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (a, b, v) = readLine().split(" ").map { it.toInt() }
    var day = (v - a) / (a - b)
    var height = (a - b) * day
    
    while (height + a < v) {
        ++day
        height += a - b
    }
    print(++day)
}
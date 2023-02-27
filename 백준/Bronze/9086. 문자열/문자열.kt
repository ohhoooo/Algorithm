import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    repeat(readLine().toInt()) {
        val str = readLine()
        print("${str.first()}")
        print("${str.last()} \n")
    }
}
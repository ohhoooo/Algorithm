import java.io.InputStreamReader
import java.io.BufferedReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val arr = Array(10) { 0 }
    val num = readLine()

    for(i in num) arr[i.code - 48] += 1

    for(i in 9 downTo 0) {
        if(arr[i] != 0) {
            repeat(arr[i]) {
                print(i)
            }
        }
    }
}
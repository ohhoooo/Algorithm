import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val arr = Array(n+1) { i -> i }

    repeat(m) {
        var (minNum, maxNum) = readLine().split(" ").map { it.toInt() }

        while(maxNum > minNum && maxNum != minNum) {
            var temp = arr[maxNum]
            arr[maxNum] = arr[minNum]
            arr[minNum] = temp
            ++minNum
            --maxNum
        }
    }

    for(i in 1 until n) {
        print("${arr[i]} ")
    }
    print("${arr[n]}")
}
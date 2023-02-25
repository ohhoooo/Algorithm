import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = Array(n+1) { i -> i }
    var temp: Int

    repeat(m) {
        val (i, j) = br.readLine().split(" ").map { it.toInt() }
        temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }
    
    for(i in 1 until n) {
        bw.write("${arr[i]} ")
    }
    
    bw.write("${arr[n]}")
    bw.flush()
    bw.close()
}
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val arr = Array(10000, {0})
    
    repeat(br.readLine().toInt()) {
        arr[br.readLine().toInt()-1] += 1
    }
    
    repeat(arr.size) {
        if(arr[it] != 0) {
            val numStr = (it+1).toString()
            repeat(arr[it]) {
                bw.write(numStr + "\n")
            }
        }
    }
    bw.flush()
    bw.close()
}
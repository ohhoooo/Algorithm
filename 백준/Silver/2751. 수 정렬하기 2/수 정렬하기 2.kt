import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = mutableListOf<Int>()
    
    repeat(br.readLine().toInt()) {
        list.add(br.readLine().toInt())
    }
    
    list.sort()
    
    repeat(list.size) {
        bw.write(list[it].toString() + "\n")
    }
    bw.flush()
    bw.close()
}
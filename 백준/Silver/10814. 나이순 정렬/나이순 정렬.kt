import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = mutableListOf<Pair<Int, String>>()
  
    repeat(br.readLine().toInt()) {
        val (a, b) = br.readLine().split(" ")
        list.add(Pair(a.toInt(), b))
    }

    list.sortedBy { it.first }.forEach {
        bw.write("${it.first} ${it.second}\n")
    }
    bw.flush()
    bw.close()
}

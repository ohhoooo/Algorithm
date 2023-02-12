import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val pairList = mutableListOf<Pair<Int, Int>>()

    repeat(br.readLine().toInt()) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        pairList.add(Pair(x, y))
    }

    pairList.sortedWith(compareBy({ it.second }, { it.first })).forEach {
        bw.write("${it.first} ${it.second}\n")
    }
    bw.flush()
    bw.close()
}
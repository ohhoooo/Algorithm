import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val pairList = mutableListOf<Pair<Int, Int>>()
    val set = mutableSetOf<Int>()

    repeat(br.readLine().toInt()) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        pairList.add(Pair(x, y))
        set.add(x)
    }

    pairList.sortBy { it.first }

    for(x in set.sorted()) {
        val yList = mutableListOf<Int>()

        for(num in 0 until pairList.size) {
            if(pairList[num].first == x) yList.add(pairList[num].second)
            else if(pairList[num].first != x) break
        }
        for(y in yList.sorted())
            bw.write("$x $y\n")

        repeat(yList.size) { pairList.removeAt(0) }
    }
    bw.flush()
    bw.close()
}
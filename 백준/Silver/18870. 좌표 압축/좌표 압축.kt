import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val size = br.readLine().toInt()
    val list = br.readLine().split(" ").map { it.toInt() }
    val pairList = mutableListOf<Pair<Int, Int?>>()

    repeat(size) { pairList.add(Pair(list[it],it)) }

    pairList.sortBy { it.first }

    var num = pairList[0].first
    var count = 0
    
    for(i in 0 until pairList.size) {
        val pairListFirstNum = pairList[i].first
        if(num == pairList[i].first) pairList[i] = Pair(count, pairList[i].second)
        else pairList[i] = Pair(++count, pairList[i].second)
        num = pairListFirstNum
    }

    pairList.sortBy { it.second }

    for(i in 0 until pairList.size) {
        if(i != pairList.size-1) bw.write("${pairList[i].first} ")
        else bw.write("${pairList[i].first}")
    }
    bw.flush()
    bw.close()
}
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = mutableListOf<String>()
    var str = ""

    repeat(br.readLine().toInt()) { list.add(br.readLine()) }

    list.sortedWith(compareBy({ it.length }, {it})).forEach {
        if(str != it) {
            bw.write("${it}\n")
            str = it
        }
    }
    bw.flush()
    bw.close()
}
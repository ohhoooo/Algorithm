import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var num = br.readLine().toInt()

    do {
        num -= 4
        bw.write("long ")
    } while (num != 0)

    bw.write("int")
    bw.flush()
    bw.close()
}

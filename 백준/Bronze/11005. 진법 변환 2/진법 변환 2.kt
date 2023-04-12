import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (a, b) = readLine().split(" ").map { it.toInt() }
    val sb = StringBuilder()

    while (a != 0) {
        val lineNum = a - (b * (a/b))
        if(lineNum > 9) sb.insert(0, (lineNum+55).toChar().toString())
        else sb.insert(0, lineNum.toString())
        a /= b
    }
    print(sb.toString())
}
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b) = readLine().split(" ")
    var sum = 0
    var bMulB = 1

    for(i in a.length-1 downTo 0) {
        sum += if(("A".."Z").contains(a[i].toString())) {
            (a[i].code - 55) * bMulB
        }else {
            (a[i].code - 48) * bMulB
        }
        bMulB *= b.toInt()
    }
    print(sum)
}
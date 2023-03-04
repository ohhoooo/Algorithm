import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine()
    val strHalfLength = str.length/2

    for(i in 0..strHalfLength) {
        if(str[i] != str[str.length-1-i]) {
            print(0)
            break
        }else if(i == strHalfLength) {
            print(1)
        }
    }
}
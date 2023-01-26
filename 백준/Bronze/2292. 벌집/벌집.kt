import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val num = readLine().toInt()
    
    var max = 1
    var mul6 = 0
    var count = 1
    
    while(num > max) {
        mul6 += 6
        max += mul6
        count++
    }
    
    print(count)
}
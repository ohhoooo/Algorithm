import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b) = readLine().split(" ").map { it.toInt() }
    val arr = Array(b+1) { it -> true }
    
    for(i in 2..(b/2))
        if(arr[i] == true) {
            var j = 2
            while(i * j <= b) {
                arr[i * j] = false
                ++j
            }
        }
    
    for(i in 2..b) if(arr[i] == true && i >= a) println(i)
}
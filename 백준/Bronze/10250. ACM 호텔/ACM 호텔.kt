import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val a = readLine().toInt()
    
    repeat(a) {
        val (h, w, n) = readLine().split(" ").map { it.toInt() }
        var roomH = if(n % h != 0) n % h else h
        var roomW = ((n - 1) / h) + 1
        
        println("$roomH" + if(roomW < 10) "0$roomW" else "$roomW")
    }
}
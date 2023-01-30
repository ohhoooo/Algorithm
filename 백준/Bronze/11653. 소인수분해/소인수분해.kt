import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var num = readLine().toInt()
    var size = 2
    
    if(num != 1) {
        while(size <= num) {
            if(num % size == 0) {
                num /= size
                println(size)
            }else size++
        }
    }
}
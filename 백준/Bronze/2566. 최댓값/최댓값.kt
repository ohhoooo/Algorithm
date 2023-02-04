import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var m = 1
    var n = 1
    var maxNum = 0
    
    for(i in 0 until 9) {
    	val line = readLine().split(" ").map { it.toInt() }
        for(j in 0 until 9) {
            if(line[j] >= maxNum) {
                m = i + 1
                n = j + 1
                maxNum = line[j]
            }
        }
    }
    print("${maxNum}\n${m} ${n}")
}
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    
    var rl = readLine().toInt()
    
    while(rl != 0) {
        val min = rl
        val max = 2 * min
        val arr = Array(max+1) { it -> true }
        
        for(i in 2..(arr.size/2)+1) {
            if(arr[i] == true) {
                var j = 2
                while(i * j <= arr.size-1) {
                    arr[i * j] = false
                    j++
                }
            }
        }
        var count = 0
        for(i in min+1..max) if(arr[i] == true) count++
    	println(count)
        rl = readLine().toInt()
    }
}
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    while (true) {
        val arr = readLine().split(" ").map { it.toInt() }.toMutableList()
        if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
            break
        }else {
            repeat(3) { arr[it] *= arr[it] }
            if((arr[0]+arr[1]+arr[2])/2 == arr.max()) {
                println("right")
            }else {
                println("wrong")
            }
        }
    }
}
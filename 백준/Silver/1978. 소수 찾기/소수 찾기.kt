import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
   val size = readLine().toInt()
   val arr = readLine().split(" ").map { it.toInt() }
   
   var count = 0
   
   repeat(size) {
       if(arr[it] == 1)
       else if(arr[it] == 2) count++
       else {
           for(i in 2..(arr[it] / 2 + 1)) {
               if(arr[it] % i == 0) break;
               else if(i == (arr[it] / 2 + 1)) count++
           }
       }
   }
   print(count)
}
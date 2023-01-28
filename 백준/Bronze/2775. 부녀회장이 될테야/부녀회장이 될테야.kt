import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val num = readLine().toInt()
    
    repeat(num) {
        val height = readLine().toInt()
        val roomNum = readLine().toInt()
        
        val list = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                                     11, 12, 13, 14)
        
        if(height == 0) println(roomNum)
        else {
           for(i in 1..((14 * (height - 1)) + roomNum)) {
               if(i % 14 == 1) list.add(1)
               else list.add(list[list.size - 14] + list[list.size - 1])
           }
           println(list[list.size - 1])
        }
    }
}
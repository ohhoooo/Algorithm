import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val list = mutableListOf<Int>()
    
    repeat(5) {
        list.add(readLine().toInt())
    }
    
    list.sort()
    
    println((list[0] + list[1] + list[2] + list[3] + list[4]) / 5)
    print(list[2])
}
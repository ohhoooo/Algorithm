import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val size = readLine().toInt()
    val list = mutableListOf<Int>()
    
    repeat(size) {
        list.add(readLine().toInt())
    }
    
    list.sort()
    
    repeat(size) {
        println(list[it])
    }
}
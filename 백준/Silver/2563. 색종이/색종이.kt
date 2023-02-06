import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val list = mutableListOf<Int>()
    var x: Int
    var y: Int
    var size = 0
    val num = readLine().toInt()
    
    repeat(num) {
        val (xNum, yNum) = readLine().split(" ").map { it.toInt() }
        list.add(xNum)
        list.add(yNum)
    }
        
    for(i in 0..99) {
        for(j in 0..99) {
            for(k in 0 until num*2 step 2) {
                x = list[k]
                y = list[k+1]
                if(j >= x && j < x+10 && i >= y && i < y+10) {
                	size++
                	break
                }
            }
        }
    }
    print(size)
}
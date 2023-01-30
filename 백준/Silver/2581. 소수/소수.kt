import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val lowNum = readLine().toInt()
    val maxNum = readLine().toInt()
    val list = mutableListOf<Int>()
    
    for(i in lowNum..maxNum) {
        if(i == 2) list.add(i)
        else if(i != 1 && i != 2) {
            for(j in 2..(i/2+1)) {
            	if(i % j == 0) break
            	else if(j == (i/2+1)) list.add(i)
        	}
        }
    }
    if(list.count() == 0) print(-1)
    else print("${list.sum()}\n${list.min()}")
}
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val size = readLine().toInt()
    
    repeat(size) {
        val number = readLine().toInt()
        
        if(number == 4) println("2 2")
        else {
        	var minNum = if((number/2) % 2 == 0) number/2 - 1 else number/2
        	var maxNum = if((number/2) % 2 == 0) number/2 + 1 else number/2
            var count = 0
            
        	while(count != 2) {
            	for(i in 2..(minNum/2+1)) {
                    if(minNum % i == 0) break
                    else if(i == (minNum/2+1) && minNum % i != 0) count++
                }
                for(i in 2..(maxNum/2+1)) {
                    if(maxNum % i == 0) break
                    else if(i == maxNum/2+1 && maxNum % i != 0) count++
                }
                if(count != 2) {
                    minNum -= 2
                    maxNum += 2
                    count = 0
                }
            }
            println("$minNum $maxNum")
        }
    }
}
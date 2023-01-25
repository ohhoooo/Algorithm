import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val num = readLine().toInt()
    val alphabetList = mutableSetOf<Char>()
    var count = 0
    
    repeat(num) {
        val str = readLine()
        var trueOrFalse = true
        alphabetList.add(str[0])
        
        for(i in 1..str.length-1) {
            if(str[i-1] != str[i] && !alphabetList.contains(str[i])) {
                alphabetList.add(str[i])
            }else if(str[i-1] != str[i] && alphabetList.contains(str[i])) {
                trueOrFalse = false
            }
        }
        alphabetList.clear()
        if(trueOrFalse == true) count++
    }
    print(count)
}
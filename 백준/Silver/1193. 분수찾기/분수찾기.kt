import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var num = readLine().toInt()
    var line = 1
    var plus = 1
    
    var m = 0
    var n = 0
    
    if(num == 1) print("1/1")
    else {
        while(!(num >= (line + 1) && num <= (plus + 1 + line))) {
            ++plus
            line += plus
        }
        num = num - line // 라인 안에서 세어야 할 숫자
        ++plus
        
        if(plus % 2 == 0) { // 짝수에 있을 경우
            m = plus + 1
            n = 0
            repeat(num) {
                m--
                n++
            }
        }else { // 홀수에 있을 경우
            m = 0
            n = plus + 1
            repeat(num) {
                m++
                n--
            }
        }
        print("$n/$m")
    }
}
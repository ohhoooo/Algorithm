import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var count = 0 // 누적기
    var sum = 0 // 합계
    
    for(i in 1..nextInt()) {
        var ox = next().split("")
        for(j in 0..(ox.size-1)) {
        	if(ox[j] == "O") {
                ++count
                sum += count
            }else count = 0
        }
        println(sum)
        sum = 0 // 점수를 print 하고 합계 초기화
        count = 0 // 점수를 print 하고 누적기 초기화
    }
}
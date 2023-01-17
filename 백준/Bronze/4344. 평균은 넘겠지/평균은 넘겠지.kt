import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var num = 0
    var prt = 0.0 // 출력할 값
    var average = 0.0 // 평균
    var list = mutableListOf<Int>()
    
    for(i in 1..nextInt()) {
        num = nextInt()
        for(j in 1..num)
            list.add(nextInt())
        
        average = list.average()
        var newList = list.filter { it > average } // 평균보다 큰 학생 리스트
        
        prt = ((newList.size * 100).toDouble() / num)
        println("${String.format("%.3f", prt)}%")
        
        list.clear()
    }
}
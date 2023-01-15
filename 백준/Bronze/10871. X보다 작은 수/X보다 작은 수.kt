import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val numSize = nextInt() // 주어지는 개수
    val numLine = nextInt() // 기준 숫자
    val col = mutableListOf<Int>() // 리스트
    
    for(i in 1..numSize) {
        col.add(nextInt())
    }
    
    val newCol = col.filter { it < numLine } // 필터링 된 리스트
    
    for(j in 1..newCol.size) {
        if(j == newCol.size) print("${newCol[j-1]}")
        else print("${newCol[j-1]} ")
    }
}
import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val numCount = nextInt() // 숫자 개수
    val list = mutableListOf<Int>() // 리스트
    
    for(i in 1..numCount) {
        list.add(nextInt())
    }
    
    print("${list.min()} ${list.max()}")
}
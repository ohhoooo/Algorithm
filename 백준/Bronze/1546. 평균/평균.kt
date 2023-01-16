import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val count = nextInt() // 과목 갯수
    val list = mutableListOf<Int>()
    
    for(i in 1..count)
        list.add(nextInt())
    
    val max = list.max() // 최고 점수
    
    val newList = list.map { it.toDouble() * 100 / max } // 고쳐진 점수 리스트
    
    print(newList.average())
}
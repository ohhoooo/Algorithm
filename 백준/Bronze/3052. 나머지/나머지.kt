import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val list = mutableListOf<Int>() // 빈 리스트
    val li = mutableListOf<Int>() // 빈 리스트
    
    for(i in 1..10) {
        list.add(nextInt())
    }

    val divList = list.map { it % 42 } // 필터링 된 리스트
    
    for(i in 1..10) {
        if(divList[i-1] !in li) li.add(divList[i-1])
    }
    
    print(li.size)
}
import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val list = mutableListOf<Int>() // 리스트
    var maxNum = 0
    var maxNumCount = 0
    
    for(i in 1..9) {
        list.add(nextInt())
    }
    
    for((index, num) in list.withIndex()) {
        if(num > maxNum) {
            maxNum = num
            maxNumCount = index
        }
    }
    println(maxNum)
    print(maxNumCount+1)
}
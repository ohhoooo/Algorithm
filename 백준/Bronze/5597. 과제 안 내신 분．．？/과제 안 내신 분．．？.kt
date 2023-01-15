import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val submitStu = mutableListOf<Int>()
    val totalStu = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)
    
    for(i in 1..28) {
        submitStu.add(nextInt())
    }
    
    val maxMinStu = totalStu.filter { it !in submitStu }
    
    println(maxMinStu.min())
    print(maxMinStu.max())
}
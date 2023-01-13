import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val a = nextInt() // 총 가격
    var count = 0
    
    for(i in 1..nextInt()) {
        count += (nextInt() * nextInt())
    }
    if(a == count) print("Yes")
    else print("No")
}
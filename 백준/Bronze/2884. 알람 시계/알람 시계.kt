import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val a = nextInt() // 시
    val b = nextInt() // 분
    
    if(b - 45 >= 0) {
        print("$a ${b - 45}")
    } else {
        if(a == 0) print("23 ${b + 15}")
        else print("${a-1} ${b + 15}")
    }
}
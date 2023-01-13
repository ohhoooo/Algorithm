import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val a = nextInt() // 위
    val b = nextInt() // 아래
    val c: Int = b % 10 // 1의 자리 수
    val d: Int = (b % 100) / 10 // 10의 자리 수
    val e: Int = b / 100 // 100의 자리 수
    
    println(a * c)
    println(a * d)
    println(a * e)
    print(a * c + a * d * 10 + a * e * 100)
}
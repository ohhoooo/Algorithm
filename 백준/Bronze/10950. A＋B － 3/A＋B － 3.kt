import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val a = nextInt()
    
    for(i in 1..a) {
        println(nextInt() + nextInt())
    }
}
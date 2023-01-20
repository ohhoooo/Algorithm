import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    val c = nextInt()
    
    if(c - b <= 0) print("-1")
    else print((a / (c - b)) + 1)
}
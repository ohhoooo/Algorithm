import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val a = nextInt()
    
    if(a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) print("1")
    else print("0")
}
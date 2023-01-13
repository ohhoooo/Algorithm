import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    
    if(a > b) print(">")
    else if(a == b) print("==")
    else print("<")
}
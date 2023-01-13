import java.util.Scanner

fun main(agrs: Array<String>) = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    
    if(a > 0 && b > 0) print("1")
    else if(a < 0 && b > 0) print("2")
    else if(a < 0 && b < 0) print("3")
    else print("4")
}
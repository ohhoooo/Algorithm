import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val number = nextInt()
    
    for(i in 1..number) {
        println("Case #$i: ${nextInt() + nextInt()}")
    }
}
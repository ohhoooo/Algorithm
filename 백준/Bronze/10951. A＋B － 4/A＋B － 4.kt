import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    while(hasNextInt()) {
        println(nextInt() + nextInt())
    }
}
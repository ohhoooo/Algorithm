import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val a = nextInt()
    when(a) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        else -> println("F")
    }
}
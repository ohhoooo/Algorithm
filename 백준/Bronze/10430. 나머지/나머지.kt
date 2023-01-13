import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    val c = nextInt()
    
    println((a + b) % c)
    println(((a % c) + (b % c)) % c)
    println((a * b) % c)
    print(((a % c) * (b % c)) % c)
}
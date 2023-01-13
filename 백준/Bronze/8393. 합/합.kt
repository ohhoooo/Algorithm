import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var count = 0
    
    for(i in 1..nextInt()) {
        count += i
    }
    print(count)
}
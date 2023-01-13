import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var star = ""
    
    for(i in 1..nextInt()) {
        star += "*"
        println(star)
    }
}
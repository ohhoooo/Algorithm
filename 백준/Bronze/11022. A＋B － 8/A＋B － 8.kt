import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var fir = 0
    var sec = 0
    
    for(i in 1..nextInt()) {
        fir = nextInt()
        sec = nextInt()
        println("Case #$i: $fir + $sec = ${fir + sec}")
    }
}
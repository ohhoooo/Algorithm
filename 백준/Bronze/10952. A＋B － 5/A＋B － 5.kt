import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var fir = nextInt()
    var sec = nextInt()
    
    do {
        println(fir + sec)
        fir = nextInt()
        sec = nextInt()
    } while(!(fir == 0 && sec == 0))
}
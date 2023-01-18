import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val numCount = nextInt()
    val num = next()
    var count = 0
    
    for(i in 0..(numCount - 1))
        count += (num[i].toInt() - 48)
    
    print(count)
}
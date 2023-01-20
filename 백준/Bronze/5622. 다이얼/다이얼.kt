import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var count = 0
    val str = next()
    
    for(i in 0..str.length-1) {
        when(str[i]) {
            in 'A'..'C' -> count += 3
            in 'D'..'F' -> count += 4
            in 'G'..'I' -> count += 5
            in 'J'..'L' -> count += 6
            in 'M'..'O' -> count += 7
            in 'P'..'S' -> count += 8
            in 'T'..'V' -> count += 9
            in 'W'..'Z' -> count += 10
        }
    }
    print(count)
}
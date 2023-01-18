import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val lineNum = nextInt()
    var count = 0
    
    for(i in 1..lineNum) {
        when(i) {
            in 1..99 -> count++
            in 100..999 -> if (((i % 10) - (i % 100 / 10)) == ((i % 100 / 10) - (i / 100))) count ++
        }
    }
    print(count)
}
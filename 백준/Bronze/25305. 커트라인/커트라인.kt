import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (people, cutLine) = readLine().split(" ").map { it.toInt() }
    var score = readLine().split(" ").map { it.toInt() }.sortedDescending()
    
    print(score[cutLine-1])
}
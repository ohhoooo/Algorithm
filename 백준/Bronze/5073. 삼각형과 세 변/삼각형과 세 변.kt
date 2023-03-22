import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    while (true) {
        val (a, b, c) = readLine().split(" ").map { it.toInt() }
        val list = mutableListOf(a, b, c)
        val max = list.max()

        if(a == 0 && b == 0 && c == 0) break
        else if(list.sum() - max <= max) println("Invalid")
        else if(a == b && b == c && b == c) println("Equilateral")
        else if(a == b && c != b || a == c && a != b || b == c && a != b) println("Isosceles")
        else println("Scalene")
    }
}
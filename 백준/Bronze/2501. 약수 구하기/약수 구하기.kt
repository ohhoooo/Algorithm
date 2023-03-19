import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val list = mutableListOf<Int>()
    val (a, b) = readLine().split(" ").map { it.toInt() }

    for(i in 1..a) {
        if(a % i == 0) list.add(i)
    }

    if(list.size < b) print(0)
    else print(list[b-1])
}
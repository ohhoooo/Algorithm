import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b) = readLine().split(" ").map { it.toInt() }
    val str = Array(a+1) { it }

    repeat(b) {
        var (begin, end, mid) = readLine().split(" ").map { it.toInt() }
        val switchBasket = mutableListOf<Int>()

        for(i in mid..end) {
            switchBasket.add(str[i])
        }
        for(i in begin until mid) {
            switchBasket.add(str[i])
        }
        switchBasket.forEach {
            str[begin] = it
            ++begin
        }
    }

    for(i in 1 until str.size-1) {
        print("${str[i]} ")
    }
    print("${str[str.size-1]}")
}
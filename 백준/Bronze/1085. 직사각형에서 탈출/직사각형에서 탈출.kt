import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (x, y, w, h) = readLine().split(" ").map { it.toInt() }
    val xZeroW = if(x >= w) x - w else if (w - x > x) x else w - x
    val yZeroH = if(y >= h) y - h else if (h - y > y) y else h - y
    if(xZeroW < yZeroH) print(xZeroW) else print(yZeroH)
}
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val xList = mutableListOf<Int>()
    val yList = mutableListOf<Int>()

    repeat(readLine().toInt()) {
        val (x, y) = readLine().split(" ").map { it.toInt() }
        xList.add(x)
        yList.add(y)
    }

    val rectangle = (xList.min() - xList.max()) * (yList.min() - yList.max())
    if(rectangle > 0) print(rectangle) else if (rectangle < 0) print(rectangle) else print(rectangle)
}
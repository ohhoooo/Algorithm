import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val list = readLine().split(" ").map { it.toInt() }.toMutableList()
    var max = list.max()

    while (true) {
        if(list.sum() - max > max) {
            print("${list.sum()}")
            break
        }
        else {
            list.remove(max)
            max -= 1
            list.add(max)
        }
    }
}
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val arr = Array(10) { 0 }

    var sum = 1
    repeat(3) {
        sum *= readLine().toInt()
    }

    val sumToString = sum.toString()
    for(i in sumToString.indices) {
        arr[sumToString[i].code-48] += + 1
    }

    repeat(10) {
        if(it < 9) println(arr[it])
        else print(arr[it])
    }
}
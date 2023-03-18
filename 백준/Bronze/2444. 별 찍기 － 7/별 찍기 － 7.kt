import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val num = readLine().toInt()
    var strNulls = num-1
    var strStars = 1

    repeat(num-1) {
        common(strNulls, strStars)
        println()
        strStars += 2
        strNulls--
    }

    repeat(num*2-1) {
        print("*")
    }

    repeat(num-1) {
        println()
        strStars -= 2
        strNulls++
        common(strNulls, strStars)
    }
}

fun common(strNulls: Int, strStars: Int) {
    repeat(strNulls) {
        print(" ")
    }
    repeat(strStars) {
        print("*")
    }
}
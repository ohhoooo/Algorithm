import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    repeat(readLine().toInt()) {
        val list = mutableListOf<Pair<Long, Long>>()
        repeat(4) {
            val (a, b) = readLine().split(" ").map { it.toLong() }
            list.add(a to b)
        }
        val sortedList = list.sortedWith(compareBy({it.first}, {it.second}))
        val oneXY = (sortedList[1].first - sortedList[0].first) * (sortedList[1].first - sortedList[0].first) + (sortedList[1].second - sortedList[0].second) * (sortedList[1].second - sortedList[0].second)
        val twoXY = (sortedList[3].first - sortedList[1].first) * (sortedList[3].first - sortedList[1].first) + (sortedList[3].second - sortedList[1].second) * (sortedList[3].second - sortedList[1].second)
        val threeXY = (sortedList[2].first - sortedList[0].first) * (sortedList[2].first - sortedList[0].first) + (sortedList[2].second - sortedList[0].second) * (sortedList[2].second - sortedList[0].second)
        val fourXY = (sortedList[3].first - sortedList[2].first) * (sortedList[3].first - sortedList[2].first) + (sortedList[3].second - sortedList[2].second) * (sortedList[3].second - sortedList[2].second)
        val diagonalOneY = sortedList[3].second - sortedList[0].second
        val diagonalOneX = sortedList[3].first - sortedList[0].first
        val diagonalTwoX = sortedList[2].first - sortedList[1].first
        val diagonalTwoY = sortedList[1].second - sortedList[2].second
        if(diagonalOneY * diagonalOneY + diagonalOneX * diagonalOneX == diagonalTwoX * diagonalTwoX + diagonalTwoY * diagonalTwoY) {
            if(oneXY == twoXY && twoXY == threeXY && threeXY == fourXY && oneXY == fourXY) {
                println(1)
            }else {
                println(0)
            }
        }else {
            println(0)
        }
    }
}
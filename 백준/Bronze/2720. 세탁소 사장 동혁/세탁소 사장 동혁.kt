import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    repeat(readLine().toInt()) {
        var money = readLine().toInt()

        val quarter = money / 25
        money %= 25

        val dime = money / 10
        money %= 10

        val nickel = money / 5
        money %= 5

        val penny = money / 1

        println("$quarter $dime $nickel $penny")
    }
}
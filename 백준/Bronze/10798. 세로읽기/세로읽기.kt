import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val lines = mutableListOf<String>()

    repeat(5) { lines.add(readLine()) }

    repeat(15) {
        if(lines[0].length > it) print(lines[0][it])
        if(lines[1].length > it) print(lines[1][it])
        if(lines[2].length > it) print(lines[2][it])
        if(lines[3].length > it) print(lines[3][it])
        if(lines[4].length > it) print(lines[4][it])
    }
}
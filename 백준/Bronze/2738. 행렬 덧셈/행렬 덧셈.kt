import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    
    val list1 = Array(n) { IntArray(m, {0}) }
    val list2 = Array(n) { IntArray(m, {0}) }
    
    for(i in 0 until n) {
        val list = readLine().split(" ").map { it.toInt() }
        for(j in 0 until m) {
            list1[i][j] = list[j]
        }
    }
    
    for(i in 0 until n) {
        val list = readLine().split(" ").map { it.toInt() }
        for(j in 0 until m) {
            list2[i][j] = list[j]
        }
    }
    
    for(i in 0 until n) {
        for(j in 0 until m) {
            list1[i][j] += list2[i][j]
        }
    }
    
    for(i in 0 until n) {
        for(j in 0 until m) {
            if(j != m) print("${list1[i][j]} ")
            else print("${list1[i][j]} \n")
        }
    }
}
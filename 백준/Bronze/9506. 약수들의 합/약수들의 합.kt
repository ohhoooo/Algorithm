import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    while (true) {
        val list = mutableListOf<Int>()
        val num = readLine().toInt()
        if(num == -1) break
        else {
            for(i in 1 until num) {
                if(num % i == 0) list.add(i)
            }
            if(list.sum() == num) {
                list.sort()
                print("$num = ")
                for(i in 0 until list.size-1) {
                    print("${list[i]} + ")
                }
                print("${list[list.size-1]}\n")
            }else {
                println("$num is NOT perfect.")
            }
        }
    }
}
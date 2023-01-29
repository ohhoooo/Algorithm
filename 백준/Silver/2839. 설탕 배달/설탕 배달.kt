import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val kg = readLine().toInt()
    var fiveKgSize = kg / 5
    
    if(kg % 5 == 0) print(kg / 5)
    else if((kg % 5) % 3 == 0) print(++fiveKgSize)
    else {
        while(fiveKgSize >= 0) {
            --fiveKgSize
            if(fiveKgSize != -1) {
                if((kg - (fiveKgSize * 5)) % 3 == 0) {
                	val threeKgSize = (kg - (fiveKgSize * 5)) / 3
                	print(fiveKgSize + threeKgSize)
                	break
            	}
            }else print(-1)
        }
    }
}
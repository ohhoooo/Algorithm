import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var line = readLine()
    
    line = line.replace("dz=","1")
    line = line.replace("c=","1")
    line = line.replace("c-","1")
    line = line.replace("d-","1")
    line = line.replace("lj","1")
    line = line.replace("nj","1")
    line = line.replace("s=","1")
    line = line.replace("z=","1")
    
    print(line.length)
}
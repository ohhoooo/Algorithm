import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val angle1 = readLine().toInt()
    val angle2 = readLine().toInt()
    val angle3 = readLine().toInt()
    val sum = angle1 + angle2 + angle3

    if(angle1 == 60 && angle2 == 60 && angle3 == 60) print("Equilateral")
    else if(sum == 180 && angle1 == angle2 || angle2 == angle3 || angle1 == angle3) print("Isosceles")
    else if(sum == 180 && angle1 != angle2 && angle1 != angle3 && angle2 != angle3) print("Scalene")
    else if(sum != 180) print("Error")
}
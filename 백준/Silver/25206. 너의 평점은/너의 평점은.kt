import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var scoreMulGradeSum = 0.0
    var sumScore = 0.0
    repeat(20) {
        val line = readLine().split(" ")
        val score = line[1].toDouble()
        val grade = gradeToInt(line[2])
        scoreMulGradeSum += score * grade
        if(line[2] != "P") sumScore += score
    }
    print(scoreMulGradeSum/sumScore)
}

fun gradeToInt(grade: String): Double {
    return when(grade) {
        "A+" -> 4.5
        "A0" -> 4.0
        "B+" -> 3.5
        "B0" -> 3.0
        "C+" -> 2.5
        "C0" -> 2.0
        "D+" -> 1.5
        "D0" -> 1.0
        else -> 0.0
    }
}
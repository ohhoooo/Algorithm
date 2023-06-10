class Solution {
    fun solution(s: String): Int {
        val sb = StringBuilder()
        val answer = StringBuilder()

        for(i in s.indices) {
            sb.append(s[i])

            if(isNumber(sb.toString()) != "null") {
                answer.append(isNumber(sb.toString()))
                sb.clear()
            }else if(isEnglishWord(sb.toString()) != "null") {
                answer.append(isEnglishWord(sb.toString()))
                sb.clear()
            }
        }
        return answer.toString().toInt()
    }

    fun isNumber(s: String): String {
        return when(s) {
            "0" -> "0"
            "1" -> "1"
            "2" -> "2"
            "3" -> "3"
            "4" -> "4"
            "5" -> "5"
            "6" -> "6"
            "7" -> "7"
            "8" -> "8"
            "9" -> "9"
            else -> "null"
        }
    }
    fun isEnglishWord(s: String): String {
        return when(s) {
            "zero" -> "0"
            "one" -> "1"
            "two" -> "2"
            "three" -> "3"
            "four" -> "4"
            "five" -> "5"
            "six" -> "6"
            "seven" -> "7"
            "eight" -> "8"
            "nine" -> "9"
            else -> "null"
        }
    }
}
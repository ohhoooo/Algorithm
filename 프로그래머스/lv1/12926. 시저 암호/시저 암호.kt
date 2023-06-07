class Solution {
    fun solution(s: String, n: Int): String {
        val sb = StringBuilder()

        for (i in s) {
            sb.append(transducer(i, n))
        }

        return sb.toString()
    }

    fun transducer(c: Char, n: Int): String {
        return if(c == ' ') " " // 공백일 경우
        else if((97..122).contains(c.code) && c.code + n > 122
            || (65..90).contains(c.code) && c.code + n > 90) { // 대문자 또는 소문자인데 n을 더했을 때 Z 또는 z를 넘는 경우
            (c.code + n - 26).toChar().toString()
        }else { // 일반적인 경우
            (c.code + n).toChar().toString()
        }
    }
}
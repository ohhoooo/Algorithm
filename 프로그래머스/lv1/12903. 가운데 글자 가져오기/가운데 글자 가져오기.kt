class Solution {
    fun solution(s: String): String {
        val sb = StringBuilder()
        return if(s.length % 2 == 0) {
            sb.append(s[s.length/2 - 1])
            sb.append(s[s.length/2])
            sb.toString()
        }else {
            sb.append(s[s.length/2])
            sb.toString()
        }
    }
}
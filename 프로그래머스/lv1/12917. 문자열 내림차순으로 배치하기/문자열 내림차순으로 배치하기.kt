class Solution {
    fun solution(s: String): String {
        val sb = StringBuilder()
        s.split("").sortedDescending().forEach {
            sb.append(it)
        }
        return sb.toString()
    }
}
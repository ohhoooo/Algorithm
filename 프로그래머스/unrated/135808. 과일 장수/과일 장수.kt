class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer = 0
        val list = score.toMutableList().apply {
            sortDescending()
        }

        for(i in m-1 until list.size step m) {
            answer += m * list[i]
        }

        return answer
    }
}
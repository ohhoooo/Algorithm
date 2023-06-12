class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val list = mutableListOf<Int>()
        val answer = IntArray(score.size) { 0 }

        for(i in score.indices) {
            list.add(score[i])
            list.sort()
            if(list.size > k) {
                list.removeAt(0)
            }
            answer[i] = list[0]
        }
        return answer
    }
}
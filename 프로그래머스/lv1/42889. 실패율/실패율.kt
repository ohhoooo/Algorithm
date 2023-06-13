class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        val answer = mutableListOf<Pair<Int, Double>>()
        var count = stages.size

        for(i in 1..N) {
            val numerator = stages.count { it == i } // 분자
            answer.add(i to numerator/count.toDouble())
            count -= numerator // 분모 감소
        }

        answer.sortWith(compareBy(
            { -it.second },
            { it.first }
        ))

        return answer.map { it.first }.toIntArray()
    }
}
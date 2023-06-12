class Solution {
    fun solution(answers: IntArray): IntArray {
        val answer = mutableListOf<Int>()

        val first = score(answers, listOf(1, 2, 3, 4, 5))
        val second = score(answers, listOf(2, 1, 2, 3, 2, 4, 2, 5))
        val third = score(answers, listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5))

        var maxScore = if(first >= second && first >= third) first
                    else if(second >= first && second >= third) second
                    else third

        if(first == maxScore) answer.add(1)
        if(second == maxScore) answer.add(2)
        if(third == maxScore) answer.add(3)

        return answer.sorted().toIntArray()
    }

    fun score(answers: IntArray, list: List<Int>): Int {
        var count = 0
        for(i in answers.indices) {
            if(answers[i] == list[i % list.size]) count++
        }
        return count
    }
}
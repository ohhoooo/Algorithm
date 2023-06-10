class Solution {
    fun solution(food: IntArray): String {
        val answer = StringBuilder()

        for(i in 1 until food.size) {
            for(j in 0 until food[i] / 2) {
                answer.append(i)
            }
        }

        answer.append(0)

        for(i in food.size-1 downTo 1) {
            for(j in food[i]/2-1 downTo 0) {
                answer.append(i)
            }
        }

        return answer.toString()
    }
}
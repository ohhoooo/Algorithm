class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val trueCount = lottos.count { win_nums.contains(it) }
        val zeroCount = lottos.count { it == 0 }

        return intArrayOf(
            rankingLotto(trueCount + zeroCount),
            rankingLotto(trueCount)
        )
    }

    fun rankingLotto(number: Int): Int {
        return when(number) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
    }
}
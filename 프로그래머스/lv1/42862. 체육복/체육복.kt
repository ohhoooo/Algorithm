class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val reserveList = reserve.sorted().toMutableList()
        val lostList = lost.sorted()
        var answer = n - lost.size

        for (i in lostList) {
            if (reserveList.contains(i)) {
                answer++
                reserveList.remove(i)
            } else if (reserveList.contains(i - 1)) {
                answer++
                reserveList.remove(i - 1)
            } else if (reserveList.contains(i + 1)) {
                if (!(lostList.contains(i + 1) && reserveList.contains(i + 1))) {
                    answer++
                    reserveList.remove(i+1)
                }
            }
        }

        return answer
    }
}
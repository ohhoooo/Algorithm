class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer = 1
        var criteriaWall = section[0]

        for(i in 1 until section.size) {
            if(criteriaWall + m - 1 < section[i]) {
                answer++
                criteriaWall = section[i]
            }
        }
        return answer
    }
}
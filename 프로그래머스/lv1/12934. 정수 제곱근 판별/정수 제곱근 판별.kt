class Solution {
    fun solution(n: Long): Long {
        var count: Long = 1
        var answer: Long
        while(count * count <= n) {
            if(count * count == n) {
                answer = (count+1) * (count+1)
                return answer
            }
            count++
        }
        answer = -1
        return answer
    }
}
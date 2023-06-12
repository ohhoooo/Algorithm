class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0

        for(i in 0 until nums.size-2) {
            for(j in i+1 until nums.size-1) {
                for(k in j+1 until nums.size) {
                    if(minorityStatus(nums[i] + nums[j] + nums[k])) {
                        answer++
                    }
                }
            }
        }
        return answer
    }

    fun minorityStatus(num: Int): Boolean {
        for(i in 2 until num) {
            if(num % i == 0) {
                return false
            }
        }
        return true
    }
}
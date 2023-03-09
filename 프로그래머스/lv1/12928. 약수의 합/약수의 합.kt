class Solution {
    fun solution(n: Int): Int {
    
        var num = n / 2
        var sum = n

        while (num > 0) {
            if(n % num == 0) {
                sum += num
            }
            --num
        }
        return sum
    }
}
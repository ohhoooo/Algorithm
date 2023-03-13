class Solution {
    fun solution(numbers: IntArray): Int {
        var sum = 0
    
        numbers.forEach { 
            sum += it
        }
        return 45 - sum
    }
}
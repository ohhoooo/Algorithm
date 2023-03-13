class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var sum = 0
        repeat(a.size) {
            sum += a[it] * b[it]
        }
        return sum
    }
}
class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var sum = 0

        repeat(absolutes.size) {
            if(signs[it]) sum += absolutes[it]
            else sum -= absolutes[it]
        }

        return sum
    }
}
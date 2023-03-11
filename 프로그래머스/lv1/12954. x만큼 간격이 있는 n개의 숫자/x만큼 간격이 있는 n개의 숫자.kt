class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var xLong = x.toLong()
        var sum: Long = xLong
        val arr = LongArray(n) { 0 }

        repeat(n) {
            arr[it] = sum
            sum += xLong
        }
        return arr
    }
}
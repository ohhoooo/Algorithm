class Solution {
    fun solution(n: Long): IntArray {
        val str = n.toString()
        val arr = IntArray(n.toString().length) { 0 }
        var size = str.length - 1

        repeat(str.length) {
            arr[size] = str[it].code - 48
            size--
        }
        return arr
    }
}
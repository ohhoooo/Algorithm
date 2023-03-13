class Solution {
    fun solution(arr: IntArray): IntArray {
        var min = arr[0]

        repeat(arr.size) {
            if(arr[it] < min) min = arr[it]
        }

        return if(arr.size != 1) arr.filter { it != min }.toIntArray()
        else intArrayOf(-1)
    }
}
class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val list = mutableListOf<Int>()

        repeat(arr.size) {
            if(arr[it] % divisor == 0) list.add(arr[it])
        }
        if (list.size == 0) list.add(-1)
        return list.toIntArray().sortedArray()
    }
}
class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = Array(arr1.size) { IntArray(arr1[0].size) }
        for(i in arr1.indices) {
            val arr = IntArray(arr1[i].size) { 0 }
            for(j in arr1[i].indices) {
                arr[j] = arr1[i][j] + arr2[i][j]
            }
            answer[i] = arr
        }
        return answer
    }
}
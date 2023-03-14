class Solution {
    fun solution(left: Int, right: Int): Int {

        var sum = 0

        for(i in left..right) {
            val arr = Array(i+1) { true }
            var num = 2
            while (num < i) {
                if(i % num != 0) {
                    var j = num
                    while (j < i) {
                        arr[j] = false
                        j += j
                    }
                }
                num++
            }
            val size = arr.filter { it }.size - 1
            if(size%2 == 0) sum += i else sum -= i
        }
        return sum
    }
}
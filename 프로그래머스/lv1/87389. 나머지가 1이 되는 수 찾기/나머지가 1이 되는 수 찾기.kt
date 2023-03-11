class Solution {
    fun solution(n: Int): Int {
        var x = 2
        while(true) {
            if(n % x == 1) {
                return x
            }else {
                x++
            }
        }
    }
}
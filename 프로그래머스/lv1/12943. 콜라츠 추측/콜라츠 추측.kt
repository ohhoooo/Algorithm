class Solution {
    fun solution(num: Int): Int {
        var num = num.toLong()
        var result = 0

        while(num != 1.toLong()) {
            if((num % 2).toInt() == 0) {
                num /= 2
            }
            else {
                num = num*3 + 1
            }
            result++

            if(result > 500) {
                result = -1
                break
            }
        }
        return result
    }
}
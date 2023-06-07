class Solution {
    fun solution(n: Int, m: Int): IntArray {
        val max = if(n >= m) n else m
        val min = if(n >= m) m else n
        val answer = mutableListOf<Int>()

        var temp = min

        // 최대공약수
        while (true) {
            if(max % temp == 0 && min % temp == 0) {
                answer.add(temp)
                break
            }else {
                temp -= 1
            }
        }

        temp = max

        // 최소공배수
        while(true) {
            if (temp % max == 0 && temp % min == 0) {
                answer.add(temp)
                break
            } else {
                temp += max
            }
        }
        
        return answer.toIntArray()
    }
}
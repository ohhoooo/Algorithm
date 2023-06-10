class Solution {
    fun solution(s: String): IntArray {
        val answer = mutableListOf<Int>()

        for(i in s.indices) {
            if(i == 0) {
                answer.add(-1)
            }else {
                for(j in i-1 downTo 0) {
                    if(s[j] == s[i]) {
                        answer.add(i-j)
                        break
                    }else if(j == 0) {
                        answer.add(-1)
                    }
                }
            }
        }

        return answer.toIntArray()
    }
}
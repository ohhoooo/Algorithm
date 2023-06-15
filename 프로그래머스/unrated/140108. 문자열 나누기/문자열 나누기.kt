class Solution {
    fun solution(s: String): Int {
        var count = -1
        var answer = 0

        loop@ while (true) {
            val x = s[++count]
            var xCount = 1
            var notXCount = 0

            while (true) {
                if (count == s.length - 1) {
                    answer++
                    break@loop
                }

                count++

                if (x == s[count]) {
                    xCount++
                } else if (xCount == notXCount + 1) {
                    answer++
                    break
                } else {
                    notXCount++
                }
            }
            if (count == s.length - 1) break
        }
        return answer
    }
}
class Solution {
    fun solution(t: String, p: String): Int {
        val sb = StringBuilder()
        var count = 0

        for(i in 0..t.length-p.length) {
            for(j in p.indices) {
                if(t[i+j] > p[j]) {
                    break
                }else if(t[i+j] < p[j]) {
                    count++
                    break
                }
                if(j==p.length-1 && t[j+j] <= p[j]) count++
            }
        }
        return count
    }
}
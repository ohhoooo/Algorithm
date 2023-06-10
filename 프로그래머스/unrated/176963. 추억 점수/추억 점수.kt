class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val answer = IntArray(photo.size) { 0 }

        for(i in photo.indices) {
            var sum = 0

            for(j in 0 until photo[i].size) {
                if(photo[i][j] in name) {
                    sum += yearning[name.indexOf(photo[i][j])]
                }
            }

            answer[i] = sum
        }

        return answer
    }
}
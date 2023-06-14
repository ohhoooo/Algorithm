class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer = 0

        for(word in babbling) {
            val sb = StringBuilder()
            var previousWord = ""

            for(i in word.indices) {
                sb.append(word[i])
                val str = sb.toString()

                if(previousWord == str || str.length > 3) {
                    break
                }else if(str == "ye" || str == "ma" || str == "aya" || str == "woo") {
                    previousWord = str
                    sb.clear()
                }

                if(i == word.length-1 && sb.isEmpty()) answer++
            }
        }
        return answer
    }
}
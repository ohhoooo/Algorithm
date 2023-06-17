class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val answer = StringBuilder()
        
        for(c in s) {
            answer.append(charChanger(c, skip, index))
        }
        
        return answer.toString()
    }

    fun charChanger(c: Char, skip: String, index: Int): Char {
        val skipToArr = skip.toCharArray()
        var cToAscii = c.code
        var count = 0

        while(true) {
            if(cToAscii+1 > 122) cToAscii = 97 else cToAscii++
            
            if(!(skipToArr.contains((cToAscii).toChar()))) count++
            
            if (count == index) break
        }
        return cToAscii.toChar()
    }
}
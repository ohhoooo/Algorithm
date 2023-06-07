class Solution {
    fun solution(s: String): String {
        val sb = StringBuilder()
        val arr = s.split(" ")

        for(i in arr.indices) {
            if(i == arr.size-1) {
                sb.append(transducer(arr[i]))
            }else {
                sb.append(transducer(arr[i]))
                sb.append(" ")
            }
        }
        return sb.toString()
    }

    fun transducer(s: String): String {
        val sb = StringBuilder()

        for(i in s.indices) {
            if(i % 2 == 0) {
                sb.append(s[i].uppercaseChar())
            }else {
                sb.append(s[i].lowercaseChar())
            }
        }
        return sb.toString()
    }
}
class Solution {
    fun solution(phone_number: String): String {
        val sb = StringBuilder()
        val phoneNumberArr = phone_number.split("")

        for(i in 0..phone_number.length-5) {
            sb.append("*")
        }

        for(i in phone_number.length-4 until phone_number.length) {
            sb.append(phone_number[i])
        }
        return sb.toString()
    }
}
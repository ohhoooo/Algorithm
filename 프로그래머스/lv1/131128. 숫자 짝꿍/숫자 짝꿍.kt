class Solution {
    fun solution(X: String, Y: String): String {
        val sb = StringBuilder()

        for(i in 9 downTo 0) {
            val x = X.count { it == (48+i).toChar() }
            val y = Y.count { it == (48+i).toChar() }

            when {
                x >= y -> addList(sb, y, i)
                else -> addList(sb, x, i)
            }
        }

        return if(sb.toString() == "") {
            "-1"
        } else if(sb.length == sb.count { it == '0' }) {
            "0"
        } else {
            sb.toString()
        }
    }

    fun addList(sb: StringBuilder, count: Int, num: Int): StringBuilder {
        if(count != 0) {
            for(i in 1..count) {
                sb.append(num)
            }
        }
        return sb
    }
}
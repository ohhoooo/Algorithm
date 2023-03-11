class Solution {
    fun solution(n: Long): Long {

        var n = n
        val list = mutableListOf<Long>()

        while(n.toInt() != 0) {
            list.add(n % 10)
            n /= 10
        }

        list.sortDescending()
        var str = ""

        for(i in list) {
            str += i.toString()
        }

        return str.toLong()
    }
}
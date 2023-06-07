class Solution {
    fun solution(n: Int): Int {
        val list = mutableListOf<Int>()
        var temp = n

        // 3진법으로 바꾸기 + 앞뒤 반전
        while (temp != 0) {
            list.add(temp % 3)
            temp /= 3
        }

        temp = 0
        var three = 1

        // 10진법으로 표현
        for(i in 0 until list.size) {
            temp += if(i == 0) list[list.size-1] else {
                three *= 3
                list[list.size-1-i] * three
            }
        }

        return temp
    }
}
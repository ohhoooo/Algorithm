class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        val list = mutableListOf<Int>()

        for(i in 1..number) {
            list.add(measure(i))
        }

        val notOverLimit = list.filter { it <= limit }.sum()
        val overLimit = list.count { it > limit } * power

        return notOverLimit + overLimit
    }

    fun measure(num: Int): Int {
        var count = 0
        for(i in 1..num/2) {
            if(num % i == 0) {
                count++
            }
        }
        return ++count
    }
}
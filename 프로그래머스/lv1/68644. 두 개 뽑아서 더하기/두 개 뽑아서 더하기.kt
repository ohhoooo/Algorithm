class Solution {
    fun solution(numbers: IntArray): IntArray {
        val list = mutableListOf<Int>()
        var number = 0

        for(i in 0 until numbers.size-1) {
            for(j in i+1 until numbers.size) {
                number = numbers[i] + numbers[j]
                if(number !in list) {
                    list.add(number)
                }
            }
        }

        return list.sorted().toIntArray()
    }
}
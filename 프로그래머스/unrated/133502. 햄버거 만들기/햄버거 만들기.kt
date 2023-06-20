class Solution {
    fun solution(ingredient: IntArray): Int {
        val list = ingredient.toMutableList()
        var answer = 0
        var size = 0

        while (size < list.size-3) {
            if(list[size] == 1 && list[size+1] == 2 && list[size+2] == 3 && list[size+3] == 1) {
                repeat(4) {
                    list.removeAt(size)
                }
                if(size > 1 && list.size > 3) {
                    size -= 2   
                }else if(size > 0 && list.size > 3) {
                    size -= 1
                }
                answer++
            }else {
                size++
            }
        }
        return answer
    }
}
class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val arr = IntArray(commands.size) { 0 }

        for(i in commands.indices) {
            val firstNumber = commands[i][0] - 1
            val lastNumber = commands[i][1] - 1
            val sortingNumber = commands[i][2] - 1

            arr[i] = array.filterIndexed { index, i -> index in firstNumber..lastNumber }.sorted()[sortingNumber]
        }

        return arr
    }
}
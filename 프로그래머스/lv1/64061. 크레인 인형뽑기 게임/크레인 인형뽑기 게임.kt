class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        val stack = mutableListOf<Int>()

        for(i in moves.indices) {
            for(j in board.indices) {
                if(board[j][moves[i]-1] != 0) {
                    stack.add(board[j][moves[i]-1])
                    board[j][moves[i]-1] = 0
                    if(stack.size > 1 && stack[stack.size-1] == stack[stack.size-2]) {
                        stack.removeAt(stack.size-1)
                        stack.removeAt(stack.size-1)
                        answer += 2
                    }
                    break
                }
            }
        }
        return answer
    }
}
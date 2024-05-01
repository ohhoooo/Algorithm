func solution(_ board:[[Int]], _ moves:[Int]) -> Int {
    var answer = 0
    var stack = [Int]()
    var verticalBoard = Array(repeating: [Int](), count: board.count)
    
    for horizontal in board {
        for (index, doll) in horizontal.enumerated() {
            if doll != 0 {
                verticalBoard[index].append(doll)
            }
        }
    }
    
    for move in moves {
        if !verticalBoard[move-1].isEmpty {
            let popDoll = verticalBoard[move-1].remove(at: 0)
            stack.append(popDoll)
            
            let count = stack.count
            if count >= 2, stack[count-1] == stack[count-2] {
                stack.removeSubrange(count-2...count-1)
                answer += 2
            }
        }
    }
    
    return answer
}
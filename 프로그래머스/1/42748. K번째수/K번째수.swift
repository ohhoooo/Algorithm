func solution(_ array:[Int], _ commands:[[Int]]) -> [Int] {
    var answer: [Int] = []
    
    for c in commands {
        let firstCondition = array[c[0]-1...c[1]-1]
        let secondCondition = firstCondition.sorted()
        let thirdCondition = secondCondition[c[2]-1]
        
        answer.append(thirdCondition)
    }
    
    return answer
}
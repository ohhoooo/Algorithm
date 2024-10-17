func solution(_ A:[Int], _ B:[Int]) -> Int {
    var answer = 0
    var sortedA = A.sorted()
    var sortedB = B.sorted(by: >)
    
    for _ in 0..<sortedA.count {
        answer += sortedA.remove(at: 0) * sortedB.remove(at: 0)
    }
    
    return answer
}
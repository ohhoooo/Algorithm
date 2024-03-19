func solution(_ k:Int, _ m:Int, _ score:[Int]) -> Int {
    var answer = 0
    var sortedScore = score.sorted(by: >)
    
    for i in stride(from: m-1, to: sortedScore.count, by: m) {
        answer += sortedScore[i]
    }
    
    return answer * m
}
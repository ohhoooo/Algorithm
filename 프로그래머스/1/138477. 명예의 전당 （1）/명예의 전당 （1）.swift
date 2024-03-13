func solution(_ k:Int, _ score:[Int]) -> [Int] {
    var answer = Array<Int>()
    var accumulationScore = Array<Int>()
    
    for s in score {
        accumulationScore.append(s)
        accumulationScore.sort(by: >)
        
        let lowestRank = getLowestRank(k, accumulationScore)
        answer.append(lowestRank)
    }
    
    return answer
}

func getLowestRank(_ k: Int, _ scores: [Int]) -> Int {
    return scores.count <= k ? scores[scores.count-1] : scores[k-1]
}
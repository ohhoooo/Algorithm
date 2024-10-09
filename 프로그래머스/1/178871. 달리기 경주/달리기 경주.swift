func solution(_ players:[String], _ callings:[String]) -> [String] {
    var answer = players
    var array: [String: Int] = [:]
    
    for (index, player) in players.enumerated() {
        array[player] = index
    }
    
    for calling in callings {
        if let rank = array[calling] {
            answer[rank] = answer[rank-1]
            array[answer[rank]] = rank
            answer[rank-1] = calling
            array[calling] = rank-1
        }
    }
    
    return answer
}
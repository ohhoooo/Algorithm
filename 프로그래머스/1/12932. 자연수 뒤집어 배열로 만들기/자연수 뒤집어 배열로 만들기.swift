func solution(_ n:Int64) -> [Int] {
    
    var answer: [Int] = []
    var nTemp = n
    
    while nTemp > 0 {
        answer.append(Int(nTemp) % 10)
        nTemp /= 10
    }
    
    return answer
}
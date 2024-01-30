func solution(_ x:Int, _ n:Int) -> [Int64] {
    var answer: [Int64] = []
    var sumX = Int64(x)
    
    for i in 1...n {
        answer.append(sumX)
        sumX += Int64(x)
    }
    
    return answer
}
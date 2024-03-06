func solution(_ x:Int, _ n:Int) -> [Int64] {
    var answer: [Int64] = []
    var increaseX = Int64(x)
    
    for i in 1...n {
        answer.append(increaseX)
        increaseX += Int64(x)
    }
    
    return answer
}
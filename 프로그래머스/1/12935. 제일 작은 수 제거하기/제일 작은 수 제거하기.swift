func solution(_ arr:[Int]) -> [Int] {
    var answer = arr
    var minNumber = answer[0]
    
    for i in answer {
        if i < minNumber {
            minNumber = i
        }
    }
    
    let index = answer.firstIndex(of: minNumber)!
    answer.remove(at: index)
    
    return answer.isEmpty ? [-1] : answer
}
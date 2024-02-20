func solution(_ arr:[Int]) -> [Int] {
    var answer = arr
    var minNumber = answer[answer.startIndex]
    
    for i in answer {
        if i < minNumber {
            minNumber = i
        }
    }
    
    let index = answer.firstIndex(of: minNumber)!
    answer.remove(at: index)
    
    if answer.isEmpty { return [-1] } else { return answer }
}
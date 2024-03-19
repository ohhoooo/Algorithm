func solution(_ s:String) -> [Int] {
    var answer = Array<Int>()
    let sArr = s.map { String($0) }
    
    for index in 0...sArr.count-1 {
        if index == 0 {
            answer.append(-1)
        } else {
            var count = 1
            
            for reverseIndex in stride(from: index-1, to: -1, by: -1) {
                if sArr[index] == sArr[reverseIndex] {
                    answer.append(count)
                    break
                } else if reverseIndex == 0 && sArr[index] != sArr[reverseIndex] {
                    answer.append(-1)
                } else {
                    count += 1
                }
            }
        }
    }
    
    return answer
}
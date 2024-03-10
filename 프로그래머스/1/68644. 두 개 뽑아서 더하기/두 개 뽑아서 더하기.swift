func solution(_ numbers:[Int]) -> [Int] {
    var answer: [Int] = []
    
    for i in 0...numbers.count-2 {
        for j in i+1...numbers.count-1 {
            if !answer.contains(numbers[i] + numbers[j]) {
                answer.append(numbers[i] + numbers[j])
            }
        }
    }
    
    return answer.sorted()
}
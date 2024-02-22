func solution(_ n:Int) -> Int {
    var answer = 0
    var decimalSystemN = n
    var threeStrikesLawArr: [Int] = []
    
    while decimalSystemN > 0 {
        threeStrikesLawArr.append(decimalSystemN % 3)
        decimalSystemN /= 3
    }
    
    var digit = 1
    
    for i in stride(from: threeStrikesLawArr.count-1, to: -1, by: -1) {
        answer += threeStrikesLawArr[i] * digit
        digit *= 3
    }
    
    return answer
}
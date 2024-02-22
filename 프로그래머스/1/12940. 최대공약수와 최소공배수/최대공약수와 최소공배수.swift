func solution(_ n:Int, _ m:Int) -> [Int] {
    var minNum = n < m ? n : m
    var maxNum = n > m ? n : m
    
    var greatestCommonDivisor = 1
    var leastCommonMultiple = maxNum
    
    for i in stride(from: minNum, to: 1, by: -1) {
        if maxNum % i == 0 && minNum % i == 0 {
            greatestCommonDivisor = i
            break
        }
    }
    
    while leastCommonMultiple % minNum != 0 || leastCommonMultiple % maxNum != 0 {
        leastCommonMultiple += maxNum
    }
    
    return [greatestCommonDivisor, leastCommonMultiple]
}
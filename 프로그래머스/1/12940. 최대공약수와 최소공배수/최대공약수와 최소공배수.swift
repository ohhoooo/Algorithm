func solution(_ n:Int, _ m:Int) -> [Int] {
    var minNum = n < m ? n : m
    var maxNum = n > m ? n : m
    
    return [getGreatestCommonDivisor(minNum, maxNum), getLeastCommonMultiple(minNum, maxNum)]
}

func getGreatestCommonDivisor(_ minNum: Int, _ maxNum: Int) -> Int {
    var greatestCommonDivisor = 1
    
    for i in stride(from: minNum, to: 1, by: -1) {
        if maxNum % i == 0 && minNum % i == 0 {
            greatestCommonDivisor = i
            break
        }
    }
    
    return greatestCommonDivisor
}

func getLeastCommonMultiple(_ minNum: Int, _ maxNum: Int) -> Int {
    var leastCommonMultiple = maxNum
    
    while leastCommonMultiple % minNum != 0 || leastCommonMultiple % maxNum != 0 {
        leastCommonMultiple += maxNum
    }
    
    return leastCommonMultiple
}
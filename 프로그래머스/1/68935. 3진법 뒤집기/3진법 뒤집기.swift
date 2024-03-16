func solution(_ n:Int) -> Int {
    return getDecimal(getTernary(n))
}

func getTernary(_ n: Int) -> [Int] {
    var decimal = n
    var ternary: [Int] = []
    
    while decimal > 0 {
        ternary.append(decimal % 3)
        decimal /= 3
    }
    
    return ternary
}

func getDecimal(_ ternary: [Int]) -> Int {
    var digit = 1
    var decimal = 0
    
    for i in stride(from: ternary.count-1, to: -1, by: -1) {
        decimal += ternary[i] * digit
        digit *= 3
    }
    
    return decimal
}
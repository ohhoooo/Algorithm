func solution(_ x:Int) -> Bool {
    var tempX = x
    var digitSumX = 0
    
    while tempX > 0 {
        digitSumX += tempX % 10
        tempX /= 10
    }
    
    if x % digitSumX == 0 { return true } else { return false }
}
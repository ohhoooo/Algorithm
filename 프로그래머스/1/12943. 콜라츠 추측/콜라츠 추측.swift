func solution(_ num:Int) -> Int {
    if num == 1 { return 0 }
    
    var count = 0
    var tempNum = num
    var arr: [Int] = []
    
    while count < 501 {
        count += 1
        
        if tempNum % 2 == 0 {
            tempNum /= 2
        } else {
            tempNum = tempNum * 3 + 1
        }
        
        if tempNum == 1 {
            return count
        }
        
        if arr.contains(tempNum) {
            return -1
        }
    }
    
    return -1
}
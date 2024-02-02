func solution(_ n:Int64) -> Int64 {
    
    var temp = 1
    
    while temp * temp <= n {
        if temp * temp == n {
            return Int64((temp + 1) * (temp + 1))
        } else {
            temp += 1
        }
    }
    
    return -1
}
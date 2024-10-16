func solution(_ s:String) -> Bool {
    var stack = 0
    
    for c in s {
        if c == "(" {
            stack += 1
        } else {
            if stack > 0 {
                stack -= 1
            } else {
                return false
            }
        }
        
        if stack > 50000 {
            return false
        }
    }
    
    return (stack == 0) ? true : false
}
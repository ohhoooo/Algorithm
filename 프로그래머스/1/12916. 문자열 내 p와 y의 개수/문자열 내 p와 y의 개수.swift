func solution(_ s: String) -> Bool {
    
    var pCount = 0
    var yCount = 0
    
    for i in s {
        if i == "p" || i == "P" {
            pCount += 1
        } else if i == "y" || i == "Y" {
            yCount += 1
        }
    }
    
    if pCount == 0 && yCount == 0 || pCount == yCount {
        return true
    } else {
        return false
    }
}
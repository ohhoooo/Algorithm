func solution(_ s:String) -> String {
    var baseIndex = s.index(s.startIndex, offsetBy: (s.count / 2))
    
    if s.count % 2 == 0 {
        var baseIndexMinusOne = s.index(s.startIndex, offsetBy: (s.count / 2)-1)
        return String(s[baseIndexMinusOne]) + String(s[baseIndex])
    } else {
        return String(s[baseIndex])
    }
}
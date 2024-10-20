func solution(_ s:String) -> String {
    var answer = ""
    let array = s.components(separatedBy: " ")
    
    for (sIndex, s) in array.enumerated() {
        for (cIndex, c) in s.enumerated() {
            if cIndex == 0 {
                if c.asciiValue! > 64 && c.asciiValue! < 91 {
                    answer += String(c)
                } else {
                    answer += c.uppercased()
                }
            } else {
                answer += c.lowercased()
            }
        }
        
        if array.count > 1 && sIndex < array.count-1 {
            answer += " "
        }
    }
    
    return answer
}
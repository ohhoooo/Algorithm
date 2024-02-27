func solution(_ s:String) -> String {
    var answer = ""
    var index = 0
    
    for c in s {
        let ascii = Int(UnicodeScalar(String(c))!.value)
        
        if ascii == 32 {
            index = 0
            answer += " "
        } else if index % 2 == 0 {
            if ascii >= 65 && ascii <= 90 {
                answer += String(c)
            } else {
                answer += String(UnicodeScalar(ascii - 32)!)
            }
            
            index += 1
        } else {
            if ascii >= 65 && ascii <= 90 {
                answer += String(UnicodeScalar(ascii + 32)!)
            } else {
                answer += String(c)
            }
            
            index += 1
        }
    }
    
    return answer
}
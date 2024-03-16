func solution(_ s:String) -> String {
    var answer = ""
    var index = 0
    
    for c in s {
        let ascii = Int(UnicodeScalar(String(c))!.value)
        
        if ascii == 32 {
            answer += " "
            index = 0
        } else {
            if index % 2 == 0 {
                answer += (ascii >= 65 && ascii <= 90) ? String(c) : String(UnicodeScalar(ascii - 32)!)
            } else {
                answer += (ascii >= 65 && ascii <= 90) ? String(UnicodeScalar(ascii + 32)!) : String(c)
            }
            index += 1
        }
    }
    
    return answer
}
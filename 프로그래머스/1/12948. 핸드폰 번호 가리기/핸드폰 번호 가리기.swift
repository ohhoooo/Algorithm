func solution(_ phone_number:String) -> String {
    var answer = ""
    
    for i in 0...phone_number.count-1 {
        if i < phone_number.count-4 {
            answer += "*"
        } else {
            answer += String(phone_number[phone_number.index(phone_number.startIndex, offsetBy: i)])
        }
    }
    
    return answer
}
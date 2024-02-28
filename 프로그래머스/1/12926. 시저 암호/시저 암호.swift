func solution(_ s:String, _ n:Int) -> String {
    var answer = ""
    
    let asciiArr = s.map { Int(UnicodeScalar(String($0))!.value) }
    
    for ascii in asciiArr {
        switch ascii {
        case 32:
            answer += " "
        case 65..<91:
            if ascii+n > 90 {
                answer += String(UnicodeScalar(ascii+n-26)!)
            } else {
                answer += String(UnicodeScalar(ascii+n)!)
            }
        case 97..<123:
            if ascii+n > 122 {
                answer += String(UnicodeScalar(ascii+n-26)!)
            } else {
                answer += String(UnicodeScalar(ascii+n)!)
            }
        default:
            break
        }
    }

    return answer
}
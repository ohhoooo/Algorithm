func solution(_ s:String, _ n:Int) -> String {
    var answer = ""
    let asciiArray = s.map { Int(UnicodeScalar(String($0))!.value) }
    
    for ascii in asciiArray {
        switch ascii {
        case 32:
            answer += " "
        case 65..<91:
            answer += (ascii+n > 90) ? String(UnicodeScalar(ascii+n-26)!) : String(UnicodeScalar(ascii+n)!)
        case 97..<123:
            answer += (ascii+n > 122) ? String(UnicodeScalar(ascii+n-26)!) : String(UnicodeScalar(ascii+n)!)
        default:
            break
        }
    }

    return answer
}
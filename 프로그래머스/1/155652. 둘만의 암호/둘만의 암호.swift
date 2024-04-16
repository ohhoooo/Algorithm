func solution(_ s:String, _ skip:String, _ index:Int) -> String {
    var answer = ""
    var skipToAsciis = stringToAsciis(skip)
    
    for i in stringToAsciis(s) {
        var ascii = i
        var count = 0
        
        while count < index {
            ascii += (ascii < 122) ? 1 : -25
            count += (skipToAsciis.contains(ascii)) ? 0 : 1
        }
        
        answer += asciiToString(ascii)
    }
    
    return answer
}

func stringToAsciis(_ s: String) -> [Int] {
    return s.map { Int(UnicodeScalar(String($0))!.value) }
}

func asciiToString(_ i: Int) -> String {
    return String(UnicodeScalar(i)!)
}
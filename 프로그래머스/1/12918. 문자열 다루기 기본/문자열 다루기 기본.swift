func solution(_ s:String) -> Bool {
    let firstCondition = s.count == 4 || s.count == 6
    let secondCondition = s.map { String($0) }.filter { Int(UnicodeScalar($0)!.value) < 48 || Int(UnicodeScalar($0)!.value) > 57 }.count == 0
    
    return firstCondition && secondCondition
}
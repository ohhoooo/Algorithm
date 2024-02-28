func solution(_ t:String, _ p:String) -> Int {
    var answer = 0
    
    let tArr = t.map { String($0) }
    let pArr = p.map { String($0) }
    
    for i in 0...t.count-p.count {
        var tDigit = i
        var pDigit = 0
        
        while pDigit < p.count {
            if Int(tArr[tDigit])! < Int(pArr[pDigit])! {
                answer += 1
                break
            } else if Int(tArr[tDigit])! > Int(pArr[pDigit])! {
                break
            } else if Int(tArr[tDigit])! == Int(pArr[pDigit])! && pDigit + 1 == p.count {
                answer += 1
                break
            } else {
                tDigit += 1
                pDigit += 1
            }
        }
    }
    
    return answer
}
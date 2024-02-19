func solution(_ seoul:[String]) -> String {
    var answer = ""
    
    for i in 0...seoul.count-1 {
        if seoul[i] == "Kim" { 
            answer = "김서방은 \(i)에 있다"
        }
    }
    
    return answer
}
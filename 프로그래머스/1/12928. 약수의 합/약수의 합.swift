func solution(_ n:Int) -> Int {
    
    var answer = 0
    
    if n == 0 { return 0 } else if n == 1 { return 1 }
        
    for i in 1...n {
        if n % i == 0 {
            answer += i
        }
    }
    
    return answer
}
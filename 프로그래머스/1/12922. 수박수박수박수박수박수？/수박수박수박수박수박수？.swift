func solution(_ n:Int) -> String {
    var answer = ""
    
    for i in 1...n {
        answer += (i % 2 == 1) ? "수" : "박"
    }
    
    return answer
}
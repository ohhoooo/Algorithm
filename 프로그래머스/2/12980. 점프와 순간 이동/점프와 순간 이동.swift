func solution(_ n: Int) -> Int {
    var info = n
    var answer = 0
    
    while info > 0 {
        answer += info % 2
        info /= 2
    }

    return answer
}
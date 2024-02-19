func solution(_ absolutes:[Int], _ signs:[Bool]) -> Int {
    var answer = 0
    
    for i in 0...signs.count - 1 {
        if signs[i] == true {
            answer += absolutes[i]
        } else {
            answer -= absolutes[i]
        }
    }
    
    return answer
}
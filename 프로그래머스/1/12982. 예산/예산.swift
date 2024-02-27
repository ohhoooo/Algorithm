func solution(_ d:[Int], _ budget:Int) -> Int {
    let departments = d.sorted()
    var budget = budget
    var answer = 0
    
    for i in 0...departments.count-1 {
        if budget - departments[i] >= 0 {
            budget -= departments[i]
            answer += 1
        } else {
            break
        }
    }
    
    return answer
}
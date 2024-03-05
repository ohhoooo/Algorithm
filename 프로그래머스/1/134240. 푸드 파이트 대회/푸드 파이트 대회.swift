func solution(_ food:[Int]) -> String {
    var answer = ""
    
    for i in 1...food.count-1 {
        if food[i] != 1 {
            for j in 1...food[i]/2 {
                answer += "\(i)"
            }
        }
    }
    
    answer += "0"
    
    for i in stride(from: food.count-1, to: 0, by: -1) {
        if food[i] != 1 {
            for j in 1...food[i]/2 {
                answer += "\(i)"
            }
        }
    }
    
    return answer
}
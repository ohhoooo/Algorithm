func solution(_ survey:[String], _ choices:[Int]) -> String {
    var answer = ""
    let score = [3, 2, 1, 0, 1, 2, 3]
    var personalityTypes = [("R", 0), ("T", 0), ("C", 0), ("F", 0), ("J", 0), ("M", 0), ("A", 0), ("N", 0)]
    
    survey.enumerated().forEach {
        var personalityType: String?
        
        switch choices[$0] {
        case 1...3:
            personalityType = $1.map { String($0) }[0]
        case 5...7:
            personalityType = $1.map { String($0) }[1]
        default:
            break
        }
        
        if let personalityType = personalityType {
            let index = personalityTypes.firstIndex { $0.0 == personalityType }!
            personalityTypes[index].1 += score[choices[$0] - 1]
        }
    }
    
    for i in stride(from: 0, to: 7, by: 2) {
        if personalityTypes[i].1 > personalityTypes[i+1].1 {
            answer += personalityTypes[i].0
        } else if personalityTypes[i].1 < personalityTypes[i+1].1 {
            answer += personalityTypes[i+1].0
        } else {
            answer += personalityTypes[i].0
        }
    }
    
    return answer
}
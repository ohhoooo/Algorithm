func solution(_ park:[String], _ routes:[String]) -> [Int] {
    var answer: [Int] = []
    
    for (yIndex, line) in park.enumerated() {
        for (xIndex, point) in line.enumerated() {
            if point == "S" {
                answer.append(yIndex)
                answer.append(xIndex)
                break
            }
        }
        
        if !answer.isEmpty {
            break
        }
    }
    
    for route in routes {
        let op = route.components(separatedBy: " ")[0]
        let n = route.components(separatedBy: " ")[1]
        
        switch op {
        case "E":
            if park[0].count - 1 >= answer[1] + Int(n)! &&
               !park[answer[0]].map { String($0) }[answer[1]...(answer[1] + Int(n)!)].contains("X") {
                answer[1] = answer[1] + Int(n)!
            }
        case "W":
            if answer[1] - Int(n)! >= 0 &&
               !park[answer[0]].map { String($0) }[(answer[1] - Int(n)!)...answer[1]].contains("X") {
                answer[1] = answer[1] - Int(n)!
            }
        case "N":
            if answer[0] - Int(n)! >= 0 &&
               !park.map { $0.map { String($0) }[answer[1]] }[(answer[0] - Int(n)!)...answer[0]].contains("X") {
                answer[0] = answer[0] - Int(n)!
            }
        default:
            if park.count - 1 >= answer[0] + Int(n)! &&
               !park.map { $0.map { String($0) }[answer[1]] }[answer[0]...(answer[0] + Int(n)!)].contains("X") {
                answer[0] = answer[0] + Int(n)!
            }
        }
    }
    
    return answer
}
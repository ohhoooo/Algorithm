func solution(_ dartResult:String) -> Int {
    var answer = [Int]()
    var current = 0
    
    for i in 0...dartResult.count-1 {
        let previousDart = (i != 0) ? String(dartResult.map { String($0) }[i-1]) : ""
        let dart = String(dartResult.map { String($0) }[i])
        
        if let num = Int(dart) {
            if i != 0 && num == 0 && previousDart == "1" {
                current = 10
            } else {
                if i != 0 && ["S","D","T"].contains(previousDart) {
                    answer.append(current)
                }
                current = num
            }
        } else {
            switch dart {
            case "S":
                break
            case "D":
                current *= current
            case "T":
                current *= current * current
            case "*":
                if answer.count != 0 {
                    answer[answer.count-1] *= 2
                }
                current *= 2
                answer.append(current)
                current = 0
            default:
                current = -current
                answer.append(current)
                current = 0
            }
        }
    }
    
    answer.append(current)
    return answer.reduce(0,+)
}
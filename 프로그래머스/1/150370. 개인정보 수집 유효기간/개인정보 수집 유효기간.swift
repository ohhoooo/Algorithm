func solution(_ today:String, _ terms:[String], _ privacies:[String]) -> [Int] {
    var answer: [Int] = []
    
    let yearOfToday = Int(today.components(separatedBy: ".")[0])!
    let monthOfToday = Int(today.components(separatedBy: ".")[1])!
    let dayOfToday = Int(today.components(separatedBy: ".")[2])!
    
    for (index, privacy) in privacies.enumerated() {
        let dateOfPrivacy = privacy.components(separatedBy: " ")[0]
        let termOfPrivacy = privacy.components(separatedBy: " ")[1]
        
        var yearOfDate = Int(dateOfPrivacy.components(separatedBy: ".")[0])!
        var monthOfDate = Int(dateOfPrivacy.components(separatedBy: ".")[1])!
        var dayOfDate = Int(dateOfPrivacy.components(separatedBy: ".")[2])!
        
        monthOfDate += terms.filter { $0.components(separatedBy: " ")[0] == termOfPrivacy }
                            .map { Int($0.components(separatedBy: " ")[1])! }[0]
        
        if monthOfDate > 12 && monthOfDate % 12 == 0 {
            yearOfDate += monthOfDate / 12 - 1
            monthOfDate = 12
        } else if monthOfDate > 12 {
            yearOfDate += monthOfDate / 12
            monthOfDate = monthOfDate % 12
        }
        
        if dayOfDate == 1 {
            dayOfDate = 28
            
            if monthOfDate == 1 {
                monthOfDate = 12
                yearOfDate -= 1
            } else {
                monthOfDate -= 1
            }
        } else {
            dayOfDate -= 1
        }
        
        if yearOfToday > yearOfDate {
            answer.append(index + 1)
        } else if yearOfToday == yearOfDate {
            if monthOfToday > monthOfDate {
                answer.append(index + 1)
            } else if monthOfToday == monthOfDate {
                if dayOfToday > dayOfDate {
                    answer.append(index + 1)
                }
            }
        }
    }
    
    return answer.sorted()
}
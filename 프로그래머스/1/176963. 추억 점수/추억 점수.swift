func solution(_ name:[String], _ yearning:[Int], _ photo:[[String]]) -> [Int] {
    var answer = [Int]()
    
    for peoples in photo {
        var score = 0
        let longingPeoples = peoples.filter { name.contains($0) }
        
        for longingPeople in longingPeoples {
            if let index = name.firstIndex(of: longingPeople) {
                score += yearning[index]
            }
        }
        
        answer.append(score)
    }
    
    return answer
}
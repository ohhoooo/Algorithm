func solution(_ cards1:[String], _ cards2:[String], _ goal:[String]) -> String {
    var card1Index = -1
    var card2Index = -1
    
    for i in 0...goal.count-1 {
        if cards1.contains(goal[i]) && card1Index+1 == cards1.firstIndex(of: goal[i]) ?? -1 {
            card1Index = cards1.firstIndex(of: goal[i])!
        } else if cards2.contains(goal[i]) && card2Index+1 == cards2.firstIndex(of: goal[i]) ?? -1 {
            card2Index = cards2.firstIndex(of: goal[i])!
        } else {
            return "No"
        }
    }
    
    return "Yes"
}
func solution(_ s:String) -> Int {
    var answer = ""
    let neoCard = s.map { String($0) }
    var cardPart = ""
    let cardArr = [("zero", "0"), ("one", "1"), ("two", "2"), ("three", "3"), ("four", "4"),
                        ("five", "5"), ("six", "6"), ("seven", "7"), ("eight", "8"), ("nine", "9")]
    
    for i in neoCard {
        switch i {
        case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9":
            answer += i
        default:
            cardPart += i
            
            let statusCompletedCard = !cardArr.filter { $0.0 == cardPart }.isEmpty
            
            if statusCompletedCard {
                answer += cardArr.filter { $0.0 == cardPart }[0].1
                cardPart = ""
            }
        }
    }
    return Int(answer)!
}
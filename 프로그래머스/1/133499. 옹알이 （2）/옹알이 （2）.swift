func solution(_ babbling:[String]) -> Int {
    var answer = 0
    var pronunciations = ["aya", "ye", "woo", "ma"]
    
    for babble in babbling {
        var previous = ""
        var word = ""
        
        for b in babble {
            word += String(b)
            
            if pronunciations.contains(word) && previous != word {
                previous = word
                word = ""
            }
        }
        
        answer += (word == "") ? 1 : 0
    }
    
    return answer
}
func solution(_ friends:[String], _ gifts:[String]) -> Int {
    var giftPair = Array(repeating: Array(repeating: 0, count: friends.count), count: friends.count)
    var giftIndex = Array(repeating: 0, count: friends.count)
    var giftRecipient = Array(repeating: 0, count: friends.count)
    
    for gift in gifts {
        let array = gift.components(separatedBy: " ")
        let giver = friends.firstIndex(of: array[0])!
        let receiver = friends.firstIndex(of: array[1])!
        
        giftPair[giver][receiver] += 1
    }
    
    for i in 0..<friends.count {
        var count = 0
        
        for j in 0..<friends.count {
            count += (i != j) ? giftPair[j][i] : 0
        }
        
        giftIndex[i] = giftPair[i].reduce(0, +) - count
    }
    
    for i in 0..<friends.count-1 {
        for j in i+1..<friends.count {
            if giftPair[i][j] > giftPair[j][i] {
                giftRecipient[i] += 1
            } else if giftPair[i][j] < giftPair[j][i] {
                giftRecipient[j] += 1
            } else {
                if giftIndex[i] > giftIndex[j] {
                    giftRecipient[i] += 1
                } else if giftIndex[i] < giftIndex[j] {
                    giftRecipient[j] += 1
                }
            }
        }
    }
    
    return giftRecipient.max()!
}
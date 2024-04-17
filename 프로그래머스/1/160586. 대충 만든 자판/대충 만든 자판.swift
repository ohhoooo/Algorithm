func solution(_ keymap:[String], _ targets:[String]) -> [Int] {
    var answer = [Int]()
    var dict = [Int: Set<String>]()
    
    for key in keymap {
        for (i, c) in key.enumerated() {
            if dict[i+1] != nil {
                dict[i+1]!.insert(String(c))
            } else {
                dict[i+1] = [String(c)]
            }
        }
    }
    
    for target in targets {
        var index = 0
        
        for c in target {
            let count = getTouchCount(String(c), dict)
            
            if count == -1 {
                index = -1
                break
            } else {
                index += count
            }
        }
        
        answer.append(index)
    }
    
    return answer
}

func getTouchCount(_ s: String, _ dict: [Int: Set<String>]) -> Int {
    for i in dict.keys.sorted() {
        if dict[i]!.contains(s) {
            return i
        }
    }
    
    return -1
}
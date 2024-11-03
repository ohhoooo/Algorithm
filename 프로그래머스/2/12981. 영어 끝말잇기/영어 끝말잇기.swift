func solution(_ n: Int, _ words: [String]) -> [Int] {
    var last = String(words[0][words[0].startIndex])
    var list = [String]()
    
    for (i, w) in words.enumerated() {
        let arr = w.map { String($0) }
        
        if list.contains(w) || last != arr.first! {
            return [(i % n) + 1, (i / n) + 1]
        } else {
            last = arr.last!
            list.append(w)
        }
    }
    
    return [0, 0]
}
func solution(_ t:String, _ p:String) -> Int {
    let tArray = t.map { String($0) }
    var tSubstrings = Array<String>()
    
    for i in 0...t.count-p.count {
        var tSubstring = ""
        
        for j in i...i+p.count-1 {
            tSubstring += tArray[j]
        }
        
        tSubstrings.append(tSubstring)
    }
    
    return tSubstrings.filter { Int($0)! <= Int(p)! }.count
}
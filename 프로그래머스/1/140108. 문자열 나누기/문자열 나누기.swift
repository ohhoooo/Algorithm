func solution(_ s:String) -> Int {
    var answer = 0
    var x = (name: "", count: 0)
    
    for s in s.map { String($0) } {
        if x.name == "" {
            x.name = s
            x.count += 1
        } else {
            x.count += (x.name == s) ? 1 : -1
            
            if x.count == 0 {
                answer += 1
                x = ("", 0)
            }
        }        
    }
    
    return (x.count != 0) ? answer + 1 : answer
}
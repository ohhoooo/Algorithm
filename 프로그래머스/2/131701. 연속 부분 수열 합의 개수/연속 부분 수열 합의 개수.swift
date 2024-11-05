func solution(_ elements: [Int]) -> Int {
    var ans = Set<Int>()
    
    for i in 0..<elements.count {
        for j in 0..<elements.count {
            var sum = 0
            
            for k in j...j+i {
                sum += elements[k % elements.count]
            }
            
            ans.insert(sum)
        }
    }
    
    return ans.count
}
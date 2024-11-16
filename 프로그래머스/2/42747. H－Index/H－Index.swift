func solution(_ citations: [Int]) -> Int {
    var ans = 0
    
    for citation in citations {
        let count = citations.filter { $0 >= citation }.count
        
        if let hIndex = [count, citation].min(), hIndex > ans {
            ans = hIndex
        }
    }
    
    return ans
}
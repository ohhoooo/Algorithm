func solution(_ k: Int, _ tangerine: [Int]) -> Int {
    var dic = [Int: Int]()
    var ans = 0
    var cnt = 0
    
    for num in tangerine {
        dic[num] = dic[num, default: 0] + 1
    }
    
    for i in dic.map { $0.value }.sorted(by: >) {
        cnt += i
        ans += 1
        
        if cnt >= k { return ans }
    }
    
    return ans
}
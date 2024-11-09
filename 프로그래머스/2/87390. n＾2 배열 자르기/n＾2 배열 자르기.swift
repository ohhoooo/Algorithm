func solution(_ n: Int, _ left: Int64, _ right: Int64) -> [Int] {
    var ans = [Int]()
    var cnt = left / Int64(n) * Int64(n) - 1
    
    for i in (left / Int64(n))...(right / Int64(n)) {
        for j in 0..<n {
            cnt += 1
            
            if left <= cnt && cnt <= right {
                ans.append((i > Int64(j)) ? Int(i + 1) : j + 1)
            }
        }
    }
    
    return ans
}
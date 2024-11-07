func solution(_ want: [String], _ number: [Int], _ discount: [String]) -> Int {
    var ans = 0
    var dic = [String: Int]()
    
    for i in 0..<discount.count - 9 {
        if i == 0 {
            for j in 0...9 {
                dic[discount[j]] = dic[discount[j], default: 0] + 1
            }
        } else {
            dic[discount[i - 1]] = dic[discount[i - 1], default: 0] - 1
            dic[discount[i + 9]] = dic[discount[i + 9], default: 0] + 1
        }
        
        for j in 0..<number.count {
            if number[j] != dic[want[j], default: 0] {
                break
            } else if j == number.count - 1 {
                ans += 1
            }
        }
    }
    
    return ans
}
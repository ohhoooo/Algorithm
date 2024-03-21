func solution(_ nums:[Int]) -> Int {
    var answer = 0
    
    for i in 0...nums.count-3 {
        for j in i+1...nums.count-2 {
            for k in j+1...nums.count-1 {
                answer += checkPrimeNumber(nums[i]+nums[j]+nums[k])
            }
        }
    }
    
    return answer
}

func checkPrimeNumber(_ num: Int) -> Int {
    for i in 2...num/2 {
        if num % i == 0 {
            return 0
        }
    }
    
    return 1
}
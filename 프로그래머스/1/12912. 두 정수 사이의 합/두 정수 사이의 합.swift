func solution(_ a:Int, _ b:Int) -> Int64 {
    var answer: Int64 = 0
    
    var lowNumber: Int64 = a >= b ? Int64(b) : Int64(a)
    var highNumber: Int64 = a >= b ? Int64(a) : Int64(b)
    
    while highNumber >= lowNumber {
        answer += lowNumber
        lowNumber += 1
    }
    
    return answer
}
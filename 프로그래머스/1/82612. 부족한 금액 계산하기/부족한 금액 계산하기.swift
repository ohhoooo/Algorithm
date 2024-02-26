func solution(_ price: Int, _ money: Int, _ count: Int) -> Int64 {
    var answer = Int64(-money)
    
    for i in 1...count {
        answer += Int64(price) * Int64(i)
    }
    
    if answer > 0 {
        return Int64(answer)
    } else {
        return Int64(0)
    }
}
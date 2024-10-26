func solution(_ n:Int) -> Int {
    var nDecimal = n
    var nBinary = [Int]()
    var nextDecimal = n + 1
    var nextBinary = [Int]()
    var answer = nextDecimal
    
    while nDecimal > 0 {
        nBinary.insert(nDecimal % 2, at: 0)
        nDecimal /= 2
    }
    
    while true {
        while nextDecimal > 0 {
            nextBinary.insert(nextDecimal % 2, at: 0)
            nextDecimal /= 2
        }
        
        if nBinary.filter { $0 == 1 }.count == nextBinary.filter { $0 == 1 }.count {
            return answer
        } else {
            answer += 1
            nextDecimal = answer
            nextBinary = []
        }
    }
}
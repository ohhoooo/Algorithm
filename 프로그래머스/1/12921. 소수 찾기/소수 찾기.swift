import Foundation

func solution(_ n:Int) -> Int {
    if n == 2 { return 1 }
    
    var nArray = Array(repeating: true, count: n+1)
    
    for i in 2...Int(sqrt(Double(n))) {
        if nArray[i] == true {
            var j = 2
            
            while i * j <= n {
                nArray[i * j] = false
                j += 1
            }
        }
    }
    
    return nArray.filter { $0 == true }.count - 2
}
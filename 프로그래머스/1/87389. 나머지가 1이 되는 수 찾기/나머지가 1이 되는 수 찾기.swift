import Foundation

func solution(_ n:Int) -> Int {
    
    var answer = 0
    
    for i in 2...n-1 {
        if n % i == 1 {
            answer = i
            break
        }
    }
    
    return answer
}
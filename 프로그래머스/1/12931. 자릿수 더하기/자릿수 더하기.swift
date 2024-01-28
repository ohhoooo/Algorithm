import Foundation

func solution(_ n:Int) -> Int {
    var number = n
    var answer = 0
    
    while number != 0 {
        answer += number % 10
        number /= 10
    }

    return answer
}
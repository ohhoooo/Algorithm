import Foundation

func solution(_ number:Int, _ limit:Int, _ power:Int) -> Int {
    var answer = 0
    
    for i in 1...number {
        var count = getMeasureCount(i)
        answer += (count > limit) ? power : count
    }
    
    return answer
}

func getMeasureCount(_ number: Int) -> Int {
    var measure = Array<Int>()
    
    for i in 1...Int(sqrt(Double(number))) {
        if number % i == 0 {
            measure.append(i)
        }
    }
    
    for i in measure {
        if !measure.contains(number/i) {
            measure.append(number/i)
        }
    }
    
    return measure.count
}
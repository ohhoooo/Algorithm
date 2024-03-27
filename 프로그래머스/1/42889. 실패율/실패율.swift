func solution(_ N:Int, _ stages:[Int]) -> [Int] {
    var failureRate = Dictionary<Int, Double>()
    var count = stages.count
    
    for stage in stages {
        if stage == N+1 {
            continue
        } else {
            failureRate[stage] = (failureRate[stage] == nil) ? 1.0 : failureRate[stage]! + 1.0
        }
    }
    
    for i in 1...N {
        if failureRate[i] == nil {
            failureRate[i] = 0.0
        } else {
            let failurePeopleCount = failureRate[i]!
            failureRate[i]! /= Double(count)
            count -= Int(failurePeopleCount)
        }
    }
    
    return failureRate.sorted { ($0.1 == $1.1) ? $0.0 < $1.0 : $0.1 > $1.1 }.map { $0.0 }
}
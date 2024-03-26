func solution(_ n:Int, _ m:Int, _ section:[Int]) -> Int {
    var answer = 0
    var paint = 0
    
    for i in 0...section.count-1 {
        if paint == 0 {
            paint = section[i]
        } else if i == section.count-1 && section[i]-paint+1 > m {
            answer += 1
        } else if section[i]-paint+1 == m {
            paint = 0
            answer += 1
        } else if section[i]-paint+1 > m {
            paint = section[i]
            answer += 1
        }
    }
    
    return (paint == 0) ? answer : answer + 1
}
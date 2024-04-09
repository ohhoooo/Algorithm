func solution(_ lottos:[Int], _ win_nums:[Int]) -> [Int] {
    var answer = 0
    var zero = 0
    
    for lotto in lottos {
        if win_nums.contains(lotto) {
            answer -= 1
        } else if lotto == 0 {
            zero += 1
        }
    }
    
    if answer == 0 && zero == 0 {
        return [6-zero, 6]
    } else {
        return (answer == 0) ? [7-zero, 6] : [answer+7-zero, answer+7]
    }
}
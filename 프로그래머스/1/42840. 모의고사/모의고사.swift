func solution(_ answers:[Int]) -> [Int] {
    var answer = Array<Int>()
    var peoples = [0, 0, 0]
    
    for i in 0...2 {
        peoples[i] = getAnswerCount(answers, i)
    }
    
    let maxNumber = peoples.sorted(by: >)[0]
    
    for i in 0...2 {
        if maxNumber == peoples[i] {
            answer.append(i+1)
        }
    }
    
    return answer
}

func getAnswerCount(_ answers: [Int], _ people: Int) -> Int {
    var count = 0
    var peoples = [[1, 2, 3, 4, 5],
                   [2, 1, 2, 3, 2, 4, 2, 5],
                   [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]]
    
    for index in 0...answers.count-1 {
        if peoples[people][index%peoples[people].count] == answers[index] {
            count += 1
        }
    }
    
    return count
}
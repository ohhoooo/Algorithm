func solution(_ wallpaper:[String]) -> [Int] {
    var answer: [Int] = []
    
    for (yIndex, line) in wallpaper.enumerated() {
        for (xIndex, c) in line.enumerated() {
            if c == "#" {
                if answer.isEmpty {
                    for i in 0...1 {
                        answer.append(yIndex + i)
                        answer.append(xIndex + i)
                    }
                } else {
                    if yIndex < answer[0] {
                        answer[0] = yIndex
                    } else if yIndex + 1 > answer[2] {
                        answer[2] = yIndex + 1
                    }
                    
                    if xIndex < answer[1] {
                        answer[1] = xIndex
                    } else if xIndex + 1 > answer[3] {
                        answer[3] = xIndex + 1
                    }
                }
            }
        }
    }
    
    return answer
}
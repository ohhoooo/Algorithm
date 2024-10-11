func solution(_ park:[String], _ routes:[String]) -> [Int] {
    var answer: [Int] = []
    
    for (yIndex, line) in park.enumerated() {
        for (xIndex, point) in line.enumerated() {
            if point == "S" {
                answer.append(yIndex)
                answer.append(xIndex)
                break
            }
        }
        
        if !answer.isEmpty {
            break
        }
    }
    
    for route in routes {
        let op = route.components(separatedBy: " ")[0]
        let n = route.components(separatedBy: " ")[1]
        
        if op == "E" {
            // 1. 주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
            if park[0].count - 1 >= answer[1] + Int(n)! {
                // 2. 주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.
                for i in ((answer[1] + 1)...(answer[1] + Int(n)!)) {
                    
                    //if park[answer[0]][i] == "X" {
                    if park[answer[0]].map { String($0) }[i] == "X" {
                        // 장애물을 만났을 경우
                        break
                    }
                    
                    if i == (answer[1] + Int(n)!) {
                        // 장애물을 만나지 않았을 경우
                        answer[1] = answer[1] + Int(n)!
                        print("E")
                    }
                }
            }
        } else if op == "W" {
            print("ㅇㅇ")
            // 1. 주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
            if answer[1] - Int(n)! >= 0 {
                // 2. 주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.
                print("wrwer")
                for i in stride(from: (answer[1] - 1), to: (answer[1] - Int(n)! - 1), by: -1) {
                    //if park[answer[0]][i] == "X" {
                    print("for 문")
                    if park[answer[0]].map { String($0) }[i] == "X" {
                        // 장애물을 만났을 경우
                        print("서쪽 장애물")
                        break
                    }
                    
                    if i == (answer[1] - Int(n)!) {
                        // 장애물을 만나지 않았을 경우
                        answer[1] = answer[1] - Int(n)!
                        print("W")
                    }
                    print(i)
                }
                print("여기가 문제니")
            }
        } else if op == "N" {
            // 1. 주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
            if answer[0] - Int(n)! >= 0 {
                // 2. 주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.
                for i in stride(from: (answer[0] - 1), to: (answer[0] - Int(n)! - 1), by: -1) {
                    
                    
                    //if park[i][answer[1]] == "X" {
                    if park[i].map { String($0) }[answer[1]] == "X" {
                        // 장애물을 만났을 경우
                        break
                    }
                    
                    if i == (answer[0] - Int(n)!) {
                        // 장애물을 만나지 않았을 경우
                        answer[0] = answer[0] - Int(n)!
                        print("N")
                    }
                }
            }
        } else {
            // 1. 주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
            if park.count - 1 >= answer[0] + Int(n)! {
                // 2. 주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.
                for i in ((answer[0] + 1)...(answer[0] + Int(n)!)) {
                    if park[i].map { String($0) }[answer[1]] == "X" {
                    //if park[i][answer[1]] == "X" {
                        // 장애물을 만났을 경우
                        break
                    }
                    
                    if i == (answer[0] + Int(n)!) {
                        // 장애물을 만나지 않았을 경우
                        answer[0] = answer[0] + Int(n)!
                        print("S")
                    }
                }
            }
        }
        
        print(answer)
    }
    
    
    
    
    return answer
}

func moveWidth() {
    
}

func moveHeight() {
    
}
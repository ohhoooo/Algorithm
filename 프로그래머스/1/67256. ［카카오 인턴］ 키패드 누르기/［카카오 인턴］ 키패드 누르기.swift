func solution(_ numbers:[Int], _ hand:String) -> String {
    var answer = ""
    var leftHand = 10
    var rightHand = 12
    
    for number in numbers {
        switch number {
        case 1, 4, 7:
            answer += "L"
            leftHand = number
        case 3, 6, 9:
            answer += "R"
            rightHand = number
        default:
            let leftDistance = (number == 0) ? getDistance(11, leftHand) : getDistance(number, leftHand)
            let rightDistance = (number == 0) ? getDistance(11, rightHand) : getDistance(number, rightHand)
            
            if leftDistance == rightDistance {
                if hand == "left" {
                    answer += "L"
                    leftHand = (number == 0) ? 11 : number
                } else {
                    answer += "R"
                    rightHand = (number == 0) ? 11 : number
                }
            } else if leftDistance > rightDistance {
                answer += "R"
                rightHand = (number == 0) ? 11 : number
            } else {
                answer += "L"
                leftHand = (number == 0) ? 11 : number
            }
        }
    }
    
    return answer
}

func getDistance(_ number: Int, _ hand: Int) -> Int {
    switch hand {
    case 1, 4, 7, 10:
        return abs((number - (hand+1)) / 3) + 1
    case 3, 6, 9, 12:
        return abs((number - (hand-1)) / 3) + 1
    default:
        return abs((number - hand) / 3)
    }
}
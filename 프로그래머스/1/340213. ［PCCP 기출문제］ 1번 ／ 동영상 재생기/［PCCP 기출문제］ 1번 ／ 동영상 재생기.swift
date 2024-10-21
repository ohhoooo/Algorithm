func solution(_ video_len:String, _ pos:String, _ op_start:String, _ op_end:String, _ commands:[String]) -> String {
    let videoLen = changeToSecond(time: video_len)
    let opStart = changeToSecond(time: op_start)
    let opEnd = changeToSecond(time: op_end)
    var answer = changeToSecond(time: pos)
    
    if answer >= opStart && answer <= opEnd {
        answer = opEnd
    }
    
    for command in commands {
        if command == "prev" {
            answer -= (answer < 10) ? answer : 10
        } else {
            answer += (answer + 10 > videoLen) ? videoLen - answer : 10
        }
        
        if answer >= opStart && answer <= opEnd {
            answer = opEnd
        }
    }
    
    return formatTime(second: answer)
}

func changeToSecond(time: String) -> Int {
    let array = time.components(separatedBy: ":").map { Int($0)! }
    
    return array[0] * 60 + array[1]
}

func formatTime(second: Int) -> String {
    let min = (second / 60 < 10) ? "0\(second / 60)" : "\(second / 60)"
    let sec = (second % 60 < 10) ? "0\(second % 60)" : "\(second % 60)"
    
    return min + ":" + sec
}
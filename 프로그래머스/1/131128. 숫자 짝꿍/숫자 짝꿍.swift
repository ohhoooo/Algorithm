func solution(_ X:String, _ Y:String) -> String {
    var answer = ""
    let xArray = getArray(X.map { Int(String($0))! })
    let yArray = getArray(Y.map { Int(String($0))! })
    
    for i in stride(from: 9, to: -1, by: -1) {
        let minNum = min(xArray[i] ?? 0, yArray[i] ?? 0)
        
        if i == 0 && minNum > 0 && answer == "" {
            answer = "0"
        } else if minNum > 0 {
            for j in 1...minNum {
                answer += "\(i)"
            }
        }
    }
    
    return (answer == "") ? "-1" : answer
}

func getArray(_ list: [Int]) -> [Int: Int] {
    var array = [Int: Int]()
    
    for i in list {
        array[i] = (array[i] ?? 0) + 1
    }
    
    return array
}
func solution(_ n:Int, _ arr1:[Int], _ arr2:[Int]) -> [String] {
    var answer: [String] = []
    
    for i in 0...n-1 {
        let arr1BinaryNumber = getBinaryNumber(arr1[i], n)
        let arr2BinaryNumber = getBinaryNumber(arr2[i], n)
        let secretMap = getSecretMap(arr1BinaryNumber, arr2BinaryNumber)
        
        answer.append(secretMap)
    }
    
    return answer
}

func getBinaryNumber(_ decimalNumber: Int, _ n:Int) -> String {
    var binaryNum: [String] = []
    var decimalNum = decimalNumber
    
    for _ in 0...n-1 {
        binaryNum.insert(String(decimalNum%2), at: 0)
        decimalNum /= 2
    }
    
    return binaryNum.joined(separator: "")
}

func getSecretMap(_ firstDecimalNumber: String, _ secondDecimalNumber: String) -> String {
    var secretMap = ""
    
    let firstNum = firstDecimalNumber.map { String($0) }
    let secondNum = secondDecimalNumber.map { String($0) }
    
    for j in 0...firstNum.count-1 {
        secretMap += firstNum[j] == "1" || secondNum[j] == "1" ? "#" : " "
    }
    
    return secretMap
}
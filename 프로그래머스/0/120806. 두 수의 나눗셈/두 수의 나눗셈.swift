import Foundation

func solution(_ num1:Int, _ num2:Int) -> Int {
    let doubleNum1 = Double(num1)
    let doubleNum2 = Double(num2)
    let answer = doubleNum1 / doubleNum2 * 1000
    
    return Int(answer)
}
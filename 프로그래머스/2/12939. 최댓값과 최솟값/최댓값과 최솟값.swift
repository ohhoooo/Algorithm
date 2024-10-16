func solution(_ s:String) -> String {
    let array = s.components(separatedBy: " ").map { Int($0)! }
    
    return String(array.min()!) + " " + String(array.max()!)
}
func solution(_ s: String) -> Int {
    var array = s.map { $0.asciiValue! }
    var stack = [UInt8]()
    
    for info in array {
        if !stack.isEmpty && stack[stack.count - 1] == info {
            stack.removeLast()
        } else {
            stack.append(info)
        }
    }
    
    return (stack.isEmpty) ? 1 : 0
}
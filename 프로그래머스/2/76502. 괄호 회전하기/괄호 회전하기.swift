func solution(_ s: String) -> Int {
    var ans = 0
    var arr = s.map { String($0) }
    var stack = [String]()
    let dictionary = [")": "(", "}": "{", "]": "["]
    
    for i in 0..<s.count {
        for j in 0..<s.count {
            if stack.isEmpty || dictionary.values.contains(arr[j]) {
                stack.append(arr[j])
            } else if dictionary[arr[j]]! == stack[stack.count - 1] {
                stack.remove(at: stack.count - 1)
            } else {
                break
            }
        }
        
        ans += (stack.isEmpty) ? 1 : 0
        arr.append(arr.remove(at: 0))
        stack.removeAll()
    }
    
    return ans
}
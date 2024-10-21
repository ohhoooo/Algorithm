func solution(_ s:String) -> [Int] {
    var answer = [0, 0]
    var array = s.map { Int(String($0))! }
    
    while array.count > 1 {
        for i in (0..<array.count).reversed() {
            if array[i] == 0 {
                answer[1] += 1
                array.remove(at: i)
            }
        }
        
        var length = array.count
        array = []
        
        while length > 0 {
            array.insert(length%2, at: 0)
            length /= 2
        }
        
        answer[0] += 1
    }
    
    return answer
}